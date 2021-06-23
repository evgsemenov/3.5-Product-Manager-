package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

public class ProductNonEmptyTest {
    private ProductManager manager = new ProductManager();
    Product product = new Product();
    private Book item1 = new Book(1, 500, "Властелин колец: Братство Кольца", "Дж.Р.Р.Толкиен");
    private Book item2 = new Book(2, 515, "Властелин колец: Две Башни", "Дж.Р.Р.Толкиен");
    private Book item3 = new Book(3, 562, "Властелин колец: Возвращение Короля", "Дж.Р.Р.Толкиен");
    private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
    private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");
    private Smartphone item6 = new Smartphone(7, 79990, "Galaxy S20 256 Gb", "Samsung");
    private Smartphone item7 = new Smartphone(8, 890, "Nokia 3310", "Nokia");
    private Product item8 = new Product(9, 100, "Legacy Product");
    private Product item9 = new Product(10, 568, "Second Legacy Product");
    private Product item10 = new Product(11, 568, "Third Legacy Product");

    @BeforeEach
    public void setup() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
    }

//    @Test
//    public void shouldFindExistLegacyItem() {
//        boolean actual = product.matches(product, "пров");
//        boolean expected = false;
//        assertEquals(expected, actual);
//    }

}