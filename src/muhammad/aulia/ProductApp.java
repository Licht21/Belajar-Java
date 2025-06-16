package muhammad.aulia;

import muhammad.yusuf.Product;
import muhammad.yusuf.*;

public class ProductApp {
    public static void main(String[] args) {
        Shampo shampo = new Shampo("Klir","woi");

        shampo.nameFunction();
        System.out.println(shampo.name);
        System.out.println(shampo.quantity);
        System.out.println(shampo.names);
    }
}

class Shampo extends Product {
    String names;
    Shampo(String name, String names) {
        super(name, 30);
        this.names = names;
        System.out.println("Ini sampo bjir");
    }

    public void nameFunction(){
        System.out.println(super.name);
        System.out.println(this.names);
    }
}
