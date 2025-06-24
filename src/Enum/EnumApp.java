package Enum;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Aulia");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelString = Level.VIP.name();
        System.out.println(levelString.getClass());

        Level level = Level.valueOf("VIP");
        System.out.println(level.getClass());

        Level[] values = Level.values();
        for(Level value: values) {
            System.out.println(value);
        }
    }
}
