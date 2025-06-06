public class DataTypeNumber {
    public static void main(String[] args) {
//        Integer
//        data type byte only consist of 1 bytes
        byte dataTypeByte = 100;
//        data type short only consist of 2 bytes
        short dataTypeShort = 1000;
//        data type integer only consist of 4 bytes
        int dataTypeInteger = 10000;
//        data type long consist of 8 bytes
        long dataTypeLong = 10000;

//        Floating Point
//        data type float consist of 4 bytes
        float dataTypeFloat = 0.1F;
//        data type double consist of 8 bytes
        double dataTypeDouble = 0.1;

//        Hexadecimal and Binarydecimal with Literals
//        data type integer literals for hexadecimal
        int hexaDecimal = 0xFFFFFF;
//        data type integer literals for binarydecimal
        int binaryDecimal = 0b1111;

//        Java support integer to be added _ for readibility
        int amount = 100_000_000;


        System.out.println(dataTypeByte);
        System.out.println(dataTypeShort);
        System.out.println(dataTypeInteger);
        System.out.println(dataTypeLong);
        System.out.println(dataTypeFloat);
        System.out.println(dataTypeDouble);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println(amount);
    }
}
