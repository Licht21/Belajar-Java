package interfaces;

public class Avanza implements Car, IsMaintenance {
    public void drive(){
        System.out.println("Avanza Drive");
    }

    public int getTire(){
        return 4;
    }

    public String hasBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

}
