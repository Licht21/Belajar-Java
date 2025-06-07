public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Long iniLong = 1000L;

        Short iniShort;
        iniShort = 10;

        byte byteConversion = iniLong.byteValue();

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniShort);
        System.out.println(byteConversion);
    }
}
