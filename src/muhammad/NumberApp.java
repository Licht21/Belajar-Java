package muhammad;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        String stringValue = "100";

        Long longValue = intValue.longValue();
        double doubleValue = intValue.doubleValue();

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);

        int stringInt = Integer.parseInt(stringValue);
        System.out.println(stringInt);
    }
}
