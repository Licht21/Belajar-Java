package override;

public class EqualApp {
    public static void main(String[] args) {

        String first = "Muhammad";
        first = first + " " + "Yusuf";

        System.out.println(first);

        String second = "Muhammad Yusuf";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
        String third = "Muhammad Yusuf";
        System.out.println(second.equals(third));

        Product product1 = new Product("Susu", 1000000);
        System.out.println(product1.hashCode());
        Product product2 = new Product("Susu", 1000000);
        System.out.println(product2.hashCode());

        System.out.println(product1.equals(product2));
    }
}
