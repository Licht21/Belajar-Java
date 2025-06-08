public class StackOverflow {
    public static void main(String[] args) {
    loop(30000);
    }

    static void loop(int loop) {
        if ( loop == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println(loop);
            loop(loop - 1);
        }
    }
}
