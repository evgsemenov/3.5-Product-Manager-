package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)


public class Book extends Product {
    private String author;

    public Book() {
    }

    public Book(int id, int cost, String name, String author) {
        super(id, cost, name);
        this.author = author;
    }
}
