package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)


public class Smartphone extends Product {
    private String vendor;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, int cost, String name, String vendor) {
        super(id, cost, name);
        this.vendor = vendor;
    }
    public boolean matches(String text) {
        Product product = new Product();
        if (super.matches(product, text)) {
            return true;
        }
        if (getVendor().contains(text)) {
            return true;
        }
        return false;
    }
}
