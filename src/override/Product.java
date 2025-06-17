package override;

import java.util.Objects;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    @Override

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Product)) return false;
//
//        Product product = (Product) o;
//
//        if(price != product.price) return false;
//        return name.equals(product.name);
//    }
}
