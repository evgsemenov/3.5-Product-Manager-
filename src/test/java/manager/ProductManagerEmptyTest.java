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

public class ProductManagerEmptyTest {
    private ProductManager manager = new ProductManager();
    private Book item1 = new Book(1, 500, "Властелин колец: Братство Кольца", "Дж.Р.Р.Толкиен");
    private Book item2 = new Book(2, 515, "Властелин колец: Две Башни", "Дж.Р.Р.Толкиен");
    private Book item3 = new Book(3, 562, "Властелин колец: Возвращение Короля", "Дж.Р.Р.Толкиен");
    private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
    private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");
    private Smartphone item6 = new Smartphone(7, 79990, "Galaxy S20 256 Gb", "Samsung");
    private Smartphone item7 = new Smartphone(8, 890, "Nokia 3310", "Nokia");

    @Test
    public void shouldReturnNullWhenFindBookByAuthorIfNoProducts() {
        Product[] actual = manager.searchBy("Стендаль");
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void houldReturnNullWhenFindSmartphoneByVendorIfNoProducts() {
        Product[] actual = manager.searchBy("Nokia");
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);

    }
}