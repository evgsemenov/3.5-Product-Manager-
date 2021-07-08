package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private int cost;
    private String name;

    public boolean matches(String text) {
        if (this.name.contains(text)) {
            return true;
        }
        return false;
    }
}

