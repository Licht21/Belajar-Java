class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + " From Manager");
    }
}

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hello " + name + " From Vice President");
    }

    void sayHelloParent(String name) {
        super.sayHello(name);
    }
}
