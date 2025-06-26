package muhammad;

public class StringApp {
    public static void main(String[] args) {
        String name = "Muhammad Yusuf Aulia";
        String lowercaseName = name.toLowerCase();
        String uppercaseName = name.toUpperCase();
        Integer stringLength = name.length();
        Boolean startsWith = name.startsWith("m");
        Boolean endsWith = name.endsWith("a");
        String[] items = name.split(" ");
        char[] names = name.toCharArray();

        System.out.println(name);
        System.out.println(lowercaseName);
        System.out.println(uppercaseName);
        System.out.println(stringLength);
        System.out.println(startsWith);
        System.out.println(endsWith);
        System.out.println(items);
        for(char nameChunk:names) {
            System.out.println(nameChunk);
        }

    }
}
