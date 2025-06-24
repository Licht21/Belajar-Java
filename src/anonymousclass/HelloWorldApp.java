package anonymousclass;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        helloWorld.sayHello();
    }

}
