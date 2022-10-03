public class Question10 {
    public static void main(String[] args) {
        String str = "Hello World!!!  ";
        System.out.println(str.repeat(3));

        String complexWhitespacesString = "    This is a strange string   ";
        System.out.println(complexWhitespacesString);
        System.out.println(complexWhitespacesString.strip());

        System.out.println("\n\u2005   ".isBlank());

        String html =
                "\t<html>\n"+
                        "\t\t<body>\n"+
                        "\t\t\t<p>Hello World</p>\n"+
                        "\t\t</body>\n"+
                        "\t<html>";

        System.out.println(html);
        System.out.println(html.stripIndent());

        System.out.println("\"Hello \\n world \"");
        System.out.println("\"Hello \\n world \"".translateEscapes());

        System.out.println(String.format("Java %s","17"));
        System.out.println("Java %s".formatted("17"));

    }
}
