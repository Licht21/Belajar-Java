package abstrct;

public abstract class abstractExample {
    abstractExample(){}

    public abstract void run();
}

class ex1 extends abstractExample {
    ex1(){}

    public void run() {
        System.out.println("Ini abstract");
    }
}
