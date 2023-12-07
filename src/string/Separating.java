package string;

public class Separating {
    public static void main(String[] args) {
        String song = "Dream on;Aerosmith;(1973)";
        String[] texts = {"first", "second", "another"};
        System.out.println(texts[1]);
        String[] split = song.split(";");

        String songName = split[0];
        String composer = split[1];
        String yearOfRelease = split[2];
        System.out.println(songName + ", " + composer + ", " + yearOfRelease);

        String hello = "hello";
        String something = hello.substring(0, 4);
        System.out.println(something);
    }
}
