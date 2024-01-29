package matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class binary_to_ip_address {
    public static void main(String[] args) throws IOException {
        // processing file
        //
        File file = new File("/home/endeavour/Stažené/PRG2F/src/matrix/header.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();

        int[] header = {4, 8};
        int[] total = {16, 32};
        int[] headerHex = {1, 2};
        int[] length = {4, 8};
        int[] length6 = {8, 12};
        int source = 96;
        int destination = 128;
        int source6 = 64;
        int destination6 = 192;
        if (st.charAt(0) == '0') {
            System.out.println("IP version: " + version(st));
            if (version(st) == 4) {
                System.out.println("Header length: " + length(st, header));
                System.out.println("Total length: " + length(st, total));
                System.out.println("Time to live: " + timeToLive(st));
                System.out.println("Protocol: " + protocol(st));
                System.out.println("Source IP: " + Arrays.toString(address(st, source)));
                System.out.println("Destination IP: " + Arrays.toString(address(st, destination)));
            } else if (version(st) == 6) {
                System.out.println("Payload length: " + length6(st));
                System.out.println("Hop limit: " + hopLimit(st));
                System.out.println("Protocol: " + protocol6(st));
                System.out.println("Source IP: " + address6(st, source6));
                System.out.println("Destination IP " + address6(st, destination6));
            }
        } else {
            System.out.println("IP version: " + st.charAt(0));
            if (st.charAt(0) == '4') {
                System.out.println("Header length: " + lengthHex(st, headerHex));
                System.out.println("Total length: " + lengthHex(st, length));
                System.out.println("Time to live: " + timeToLiveHex(st));
                System.out.println("Protocol: " + protocolHex(st));
                System.out.println("Source IP: " + Arrays.toString(addressHex(st, 24)));
                System.out.println("Destination IP: ");
            } else if (st.charAt(0) == '6') {
                System.out.println("Payload length: " + lengthHex(st, length6));
                System.out.println("Hop limit: ");
                System.out.println("Protocol: ");
                System.out.println("Source IP: ");
                System.out.println("Destination IP ");
            }
        }
    }

    private static int version(String st) {
        int[] version_part = new int[4];

        for (int i = 0; i < version_part.length; i++) {
            version_part[i] = parseInt(String.valueOf(st.charAt(i)));
        }

        return convert(version_part);
    }

    private static int length(String st, int[] range) {
        int[] part = new int[range[1] - range[0]];

        for (int i = range[0], n = 0; i < range[1]; i++, n++) {
            part[n] = parseInt(String.valueOf(st.charAt(i)));
        }

        if (part.length == 4) {
            return convert(part) * 4;
        }
        return convert(part);
    }

    private static int length6(String st) {
        int[] part = new int[16];

        for (int i = 32, n = 0; i < 48; i++, n++) {
            part[n] = parseInt(String.valueOf(st.charAt(i)));
        }
        return convert(part);
    }

    private static int lengthHex(String st, int[] range) {
        int[] part;

        part = stringToHex(st, range);

        return convertHex(part);
    }

    private static int timeToLive(String st) {
        int[] hops = new int[8];

        for (int i = 64, n = 0; i < 72; i++, n++) {
            hops[n] = parseInt(String.valueOf(st.charAt(i)));
        }

        return convert(hops) - 1;
    }

    private static int timeToLiveHex(String st) {
        int[] hops;

        int[] range = {16, 18};

        hops = stringToHex(st, range);

        return convertHex(hops);
    }

    private static int hopLimit(String st) {
        int[] hops = new int[8];

        for (int i = 56, n = 0; i < 64; i++, n++) {
            hops[n] = parseInt(String.valueOf(st.charAt(i)));
        }

        return convert(hops) - 1;
    }

    private static String protocol(String st) {
        int[] protocol = new int[8];

        for (int i = 72, n = 0; i < 80; i++, n++) {
            protocol[n] = parseInt(String.valueOf(st.charAt(i)));
        }

        return getProtocol(protocol);
    }

    private static String protocol6(String st) {
        int[] protocol = new int[8];

        for (int i = 48, n = 0; i < 56; i++, n++) {
            protocol[n] = parseInt(String.valueOf(st.charAt(i)));
        }

        return getProtocol(protocol);
    }

    private static String protocolHex(String st) {
        int[] protocol;

        int[] range = {18, 20};
        protocol = stringToHex(st, range);

        int[] converted = new int[1];
        converted[0] = convertHex(protocol);

        return getProtocol(converted);
    }

    private static String getProtocol(int[] protocol) {
        return switch (convert(protocol)) {
            case 6 -> "TCP";
            case 17 -> "UDP";
            case 27 -> "RDP";
            case 36 -> "XTP";
            case 84 -> "TTP";
            default -> "ICMP";
        };
    }

    private static int[] address(String st, int start) {
        int[][] part = new int[4][8];

        splitAddress(st, start, part);
        int[] decimal = new int[part.length];
        for (int i = 0; i < part.length; i++) {
            decimal[i] = convert(part[i]);
        }

        return decimal;
    }

    private static String address6(String st, int start) {
        int[][] part = new int[32][4];

        splitAddress(st, start, part);
        int[] decimal = new int[part.length];
        String hex = "";
        for (int i = 0; i < part.length; i++) {
            decimal[i] = convert(part[i]);
            hex = convert6(decimal);
        }

        return hex;
    }

    private static int[] addressHex(String st, int start) {
        String[][] part = new String[4][2];

        splitAddressHex(st, start, part);
        int[] decimal = new int[0];

//        decimal = stringToHex(st, part);
//        for (int i = 0; i < part.length; i++) {
//            decimal[i] = convertHex(part[i]);
//        }

        return decimal;
    }

    private static void splitAddress(String st, int start, int[][] part) {
        int counter = start;

        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[i].length; j++) {
                part[i][j] = parseInt(String.valueOf(st.charAt(counter)));
                counter++;
            }
        }
    }

    private static void splitAddressHex(String st, int start, String[][] part) {
        int counter = start;

        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[i].length; j++) {
                part[i][j] = String.valueOf(st.charAt(counter));
                counter++;
                System.out.print(part[i][j]);
            }
            System.out.println();
        }
    }

    private static int convert(int[] part) {
        int[] switched_part = new int[part.length];

        for (int i = part.length - 1, n = 0; i >= 0; i--, n++) {
            switched_part[n] = part[i];
        }

        int result = 0;
        for (int i = 0; i < switched_part.length; i++) {
            result += (int) (switched_part[i] * Math.pow(2, i));
        }

        return result;
    }

    private static String convert6(int[] decimal) {
        StringBuilder address = new StringBuilder();

        for (int i = 0; i < decimal.length; i++) {
            switch (decimal[i]) {
                case 1:
                    address.append("1");
                    break;
                case 2:
                    address.append("2");
                    break;
                case 3:
                    address.append("3");
                    break;
                case 4:
                    address.append("4");
                    break;
                case 5:
                    address.append("5");
                    break;
                case 6:
                    address.append("6");
                    break;
                case 7:
                    address.append("7");
                    break;
                case 8:
                    address.append("8");
                    break;
                case 9:
                    address.append("9");
                    break;
                case 10:
                    address.append("A");
                    break;
                case 11:
                    address.append("B");
                    break;
                case 12:
                    address.append("C");
                    break;
                case 13:
                    address.append("D");
                    break;
                case 14:
                    address.append("E");
                    break;
                case 15:
                    address.append("F");
                    break;
                default:
                    address.append("0");
            }
            if ((i + 1) % 4 == 0 && (i + 1) != decimal.length) {
                address.append(":");
            }
        }

        return address.toString();
    }

    private static int[] stringToHex(String st, int[] range) {
        int[] decimal = new int[range[1] - range[0]];

        for (int i = range[0], n = 0; i < range[1]; i++, n++) {
            switch (st.charAt(i)) {
                case '1':
                    decimal[n] = 1;
                    break;
                case '2':
                    decimal[n] = 2;
                    break;
                case '3':
                    decimal[n] = 3;
                    break;
                case '4':
                    decimal[n] = 4;
                    break;
                case '5':
                    decimal[n] = 5;
                    break;
                case '6':
                    decimal[n] = 6;
                    break;
                case '7':
                    decimal[n] = 7;
                    break;
                case '8':
                    decimal[n] = 8;
                    break;
                case '9':
                    decimal[n] = 9;
                    break;
                case 'a':
                    decimal[n] = 10;
                    break;
                case 'b':
                    decimal[n] = 11;
                    break;
                case 'c':
                    decimal[n] = 12;
                    break;
                case 'd':
                    decimal[n] = 13;
                    break;
                case 'e':
                    decimal[n] = 14;
                    break;
                case 'f':
                    decimal[n] = 15;
                    break;
                default:
                    decimal[n] = 0;
                    break;
            }
        }

        return decimal;
    }

    private static int convertHex(int[] part) {
        int[] switched_part = new int[part.length];

        for (int i = part.length - 1, n = 0; i >= 0; i--, n++) {
            switched_part[n] = part[i];
        }

        int result = 0;
        for (int i = 0; i < switched_part.length; i++) {
            result += (int) (switched_part[i] * Math.pow(16, i));
        }

        return result;
    }
}
