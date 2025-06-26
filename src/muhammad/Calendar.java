package muhammad;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.YEAR, 2020);

        System.out.println(calendar.getTime());
    }
}
