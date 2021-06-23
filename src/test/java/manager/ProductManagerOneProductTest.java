package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerOneProductTest {
    private ProductManager manager = new ProductManager();
    private Book item1 = new Book(1, 500, "Властелин колец: Братство Кольца", "Дж.Р.Р.Толкиен");
    private Book item2 = new Book(2, 515, "Властелин колец: Две Башни", "Дж.Р.Р.Толкиен");
    private Book item3 = new Book(3, 562, "Властелин колец: Возвращение Короля", "Дж.Р.Р.Толкиен");
    private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
    private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");
    private Smartphone item6 = new Smartphone(7, 79990, "Galaxy S20 256 Gb", "Samsung");
    private Smartphone item7 = new Smartphone(8, 890, "Nokia 3310", "Nokia");


    @Test
    public void shouldFindBookByAuthorIfOneProductTest() {
        manager.save(item3);
        Product[] actual = manager.searchBy("Дж.Р.Р.Толкиен");
        Product[] expected = new Product[]{item3};
        assertArrayEquals(expected, actual);
    }


    @Test

    public void shouldFindSmartphoneByVendorIfOneProductTest() {
        manager.save(item6);
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = new Product[]{item6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindBookByNameIfOneProductTest() {
        manager.save(item4);
        Product[] actual = manager.searchBy("Красное и черное");
        Product[] expected = new Product[]{item4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSmartphonesByNameIfOneProductTest() {
        manager.save(item6);
        Product[] actual = manager.searchBy("Galaxy S20 256 Gb");
        Product[] expected = new Product[]{item6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullWhenFindIfNoExistIfOneProductsTest() {
        manager.save(item5);
        Product[] actual = manager.searchBy("Apple");
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);
    }
}


