public class ManagerApp {
    public static void main(String[] args) {
        VicePresident vp1 = new VicePresident();
        Manager mgr1 = new Manager();

        mgr1.sayHello("Yusuf");
        vp1.sayHelloParent("Aulia");
        vp1.sayHello("Aulia");
    }
}
