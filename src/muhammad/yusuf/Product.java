package muhammad.yusuf;

public class Product {
    public String name;
    public int quantity;

    protected Product(){

    }

    protected Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void nameFunction(){
        System.out.println(this.name);
    }
}
