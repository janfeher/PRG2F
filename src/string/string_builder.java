package string;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("ka");
        builder.append("yak");
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
