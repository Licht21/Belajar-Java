public class ManagerApp {
    public static void main(String[] args) {
        VicePresident vp1 = new VicePresident("Yusuf");
        Manager mgr1 = new Manager("Aulia");

        System.out.println(vp1.name);
        System.out.println(mgr1.name);

        vp1.sayHelloParent("Aulia");
        vp1.sayHello("Aulia");

        mgr1.sayHello("Yusuf");
    }
}
