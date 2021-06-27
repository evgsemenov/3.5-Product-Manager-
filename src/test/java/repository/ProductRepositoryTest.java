package repository;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import manager.ProductManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
    private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");

    @Test
    public void shouldRemoveByIdIfExist() {
        repository.save(item5);
        repository.removeById(6);
        Product[] actual = repository.findAll();
        ProductRepository[] expected = new ProductRepository[]{};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldShowNotFoundExceptionIfRemoveByIdNotExist() {
        repository.save(item5);
        assertThrows(ru.netology.exception.NotFoundException.class, ()-> repository.removeById(15));
    }
}