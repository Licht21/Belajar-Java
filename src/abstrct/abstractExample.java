package abstrct;

abstract class abstractExample {
    abstractExample(){}

    protected abstract void run();
}

class ex1 extends abstractExample {
    ex1(){}

    public void run() {
        System.out.println("Ini abstract");
    }
}
