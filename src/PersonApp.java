public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        person1.name = "Muhammad Yusuf Aulia";
        System.out.println(person1.country);
        System.out.println(person1.name);
        person1.sayHello("Ahmad");
        System.out.println(person2);
    }
}
