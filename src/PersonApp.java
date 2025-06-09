public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Muhammad Yusuf Aulia","Sekata");
        Person person2 = new Person("Eko");
        Person person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        person1.sayHello("Ahmad");

        System.out.println(person2.name);
        System.out.println(person2.address);
        person2.sayHello("Ahmad");

        System.out.println(person3.name);
        System.out.println(person3.address);
        person3.sayHello();
    }
}
