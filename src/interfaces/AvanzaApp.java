package interfaces;

public class AvanzaApp {
    public static void main(String[] args) {
        Avanza car = new Avanza();

        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.hasBrand());
        System.out.println(car.isMaintenance());
        System.out.println(car.isBig());
        System.out.println(car.isSecond());
        System.out.println(car.toString());
    }
}
