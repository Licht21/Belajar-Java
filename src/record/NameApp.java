package record;

public class NameApp {
    public static void main(String[] args) {
        Name yusuf = new Name("Muhammad","Yusuf");
        Name aulia = new Name();
        System.out.println(yusuf.firstName());
        System.out.println(aulia.firstName());
        System.out.println(yusuf.lastName());
        System.out.println(yusuf.hashCode());
        System.out.println(yusuf.getClass());
        System.out.println(yusuf);
    }
}
