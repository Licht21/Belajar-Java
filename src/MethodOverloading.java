public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("a","a");
    }

    static void sayHello() {
        System.out.println("Hello World");
    }

    static String sayHello(String name) {
        return "Hello " + name;
    }

    static void sayHello(String args, String name) {
        System.out.println("Hello World!!");
    }
}
