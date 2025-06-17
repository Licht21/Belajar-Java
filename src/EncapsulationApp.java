public class EncapsulationApp {
    public static void main(String[] args) {
        Encapsulation test = new Encapsulation();

        test.setId("Aulia");
        test.setId(null);
        System.out.println(test.getId());
    }
}
