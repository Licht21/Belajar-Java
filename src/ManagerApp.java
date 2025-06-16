public class ManagerApp {
    public static void main(String[] args) {
        VicePresident vp1 = new VicePresident("Yusuf");
        Manager mgr1 = new VicePresident("Aulia");
        CleaningService cs1 = new CleaningService("Lubis");

//        System.out.println(vp1.name);
//        System.out.println(mgr1.name);

//        vp1.sayHelloParent("Aulia");
//        vp1.sayHello("Aulia");

//        mgr1.sayHello("Yusuf");

        sayHello(new Manager("Muhammad Yusuf Aulia"));
        System.out.println(vp1 instanceof Object);
    }

    static void sayHello(Manager manager) {
        if(manager instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) manager;
            vicePresident.sayHello("Muhammad");
        } else if(manager instanceof CleaningService) {
            CleaningService cleaningService = (CleaningService) manager;
            cleaningService.sayHello("Yusuf");
        } else {
            manager.sayHello("Aulia");
        }
    }
}
