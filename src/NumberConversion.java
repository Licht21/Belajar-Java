public class NumberConversion {
    public static void main(String[] args) {
//        Java can be used to conversion on size of number
//        If its widening casting java can automatically do itself
//        But if its narrowing casting, we must make sure the data type we convert can handle the number of data, if not will make overflow
//        Ex int 1000 to byte
//        Narrowing Casting
        long thisLong = 1_000;
        int thisInt = (int) thisLong;
        short thisShort = (short) thisInt;
        byte thisByte = (byte) thisShort;

        System.out.println(thisLong); // 1000
        System.out.println(thisInt); // 1000
        System.out.println(thisShort); // 1000
//        As we can see, byte can't handle 1000 so it's output is -24
        System.out.println(thisByte); // -24

//        Widening Casting
        byte wideningByte = 1;
        short wideningShort = wideningByte;
        int wideningInt = wideningShort;
        long wideningLong = wideningInt;

        System.out.println(wideningByte);
        System.out.println(wideningShort);
        System.out.println(wideningInt);
        System.out.println(wideningLong);
    }
}
