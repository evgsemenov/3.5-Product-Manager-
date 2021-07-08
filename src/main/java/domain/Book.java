package domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)


public class Book extends Product {
    private String author;

    public Book(int id, int cost, String name, String author) {
        super(id, cost, name);
        this.author = author;
    }

@Override

    public boolean matches(String text) {
        if (super.matches(text)) {
            return true;
        }
        if (this.author.contains(text)) {
            return true;
        }
        return false;
    }
}
