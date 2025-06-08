public class Method {
    public static void main(String[] args) {
        String name = "Muhammad Yusuf Aulia";
        String weather = "rainy";
    String ucapan = helloWorld(name, weather);
        System.out.println(ucapan);
    }

    static String helloWorld(String name, String weather) {
        return "Hello " + name + " It's " + weather + " day";
    }
}
