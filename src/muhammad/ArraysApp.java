package muhammad;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};

        int result = Arrays.binarySearch(numbers,6);
        System.out.println(result);
    }
}
