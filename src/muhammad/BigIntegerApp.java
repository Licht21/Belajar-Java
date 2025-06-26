package muhammad;

import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("10");
        BigInteger b = new BigInteger("20");

        BigInteger result = bigInteger.add(b);
        System.out.println(result);
    }
}
