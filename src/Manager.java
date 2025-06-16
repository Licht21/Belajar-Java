class Manager {
    String name;

    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + " From Manager");
    }
}

class VicePresident extends Manager {
    String name;

    VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        this.name = super.name;
        System.out.println("Hello " + name + " From Vice President");
    }

    void sayHelloParent(String name) {
        super.sayHello(name);
    }
}

class CleaningService extends Manager {

    CleaningService(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + " From Cleaning Service");
    }

    void sayHelloParent(String name) {
        super.sayHello(name);
    }
}
