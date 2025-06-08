public class LoopingStatement {
    public static void main(String[] args) {
        int a = 1;

//        For Statement
        for (int b = 1; b <= 10; b++) {
            System.out.println("counter " + b);
        }

//        While statement
        System.out.println(a);
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

//        Do While Statement
        do {
            System.out.println("Do While" + a);
        } while (a <= 10);
    }
}
