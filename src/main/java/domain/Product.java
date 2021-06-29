package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor

public class Product {
    private int id;
    private int cost;
    private String name;

    public Product(int i, int i1, String legacy_product) {
    }

    public boolean matches(Product product, String text) {
        if (product.getName().contains(text)) {
            return true;
        }
        return false;
    }
}

