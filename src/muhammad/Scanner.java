package muhammad;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Name:");
        String name = scanner.nextLine();
        scanner.nextBoolean();

        System.out.println(name);
    }
}
