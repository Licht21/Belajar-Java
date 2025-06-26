package muhammad;

public class SystemApp {
    public static void main(String[] args) {
        String version = System.getenv("JAVA_HOME");
        System.out.println(version);
    }
}
