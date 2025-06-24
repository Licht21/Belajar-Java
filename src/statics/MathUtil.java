package statics;

public class MathUtil {
    static String name = "Muhammad Yusuf Aulia";

    static int add(int... values) {
        int total = 0;
        for(int value:values) {
            total += value;
        }
        return total;
    }
}
