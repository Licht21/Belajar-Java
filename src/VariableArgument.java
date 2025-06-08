public class VariableArgument {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println(add(values));

//        Also can be used with this way
        System.out.println(add(1,2,3,4,5));
    }

    static int add(int... values) {
        int init = 0;
        for (int value : values) {
            init += value;
        }
        return init;
    }

}
