package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)


public class Smartphone extends Product {
    private String vendor;

    public Smartphone() {
    }

    public Smartphone(int id, int cost, String name, String vendor) {
        super(id, cost, name);
        this.vendor = vendor;
    }
}
