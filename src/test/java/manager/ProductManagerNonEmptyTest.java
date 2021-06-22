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
//
//@ExtendWith(MockitoExtension.class)
//public class ProductManagerTest {
//    @Mock
//    private ProductRepository repository;
//
//    @InjectMocks
//    private ProductManager manager;
//
//    public Product[] findAll() {
//        return products;
//        private Book item1 = new Book(1, 500, "Властелин колец: Братство Кольца", "Дж.Р.Р.Толкиен");
//        private Book item2 = new Book(2, 515, "Властелин колец: Две Башни", "Дж.Р.Р.Толкиен");
//        private Book item3 = new Book(3, 562, "Властелин колец: Возвращение Короля", "Дж.Р.Р.Толкиен");
//        private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
//        private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");
//        private Smartphone item6 = new Smartphone(7, 79990, "Iphone 12 64Gb", "Apple");
//        private Smartphone item7 = new Smartphone(8, 890, "Nokia 3310", "Nokia");
//
//
//        @Test
//        void searchBy () {
//            Product[] returned = new Product[]{item1, item2, item3, item4, item5, item6, item7}
//doReturn(returned).when(re)
//        }

public class ProductManagerNonEmptyTest {
    private ProductManager manager = new ProductManager();
    private Book item1 = new Book(1, 500, "Властелин колец: Братство Кольца", "Дж.Р.Р.Толкиен");
    private Book item2 = new Book(2, 515, "Властелин колец: Две Башни", "Дж.Р.Р.Толкиен");
    private Book item3 = new Book(3, 562, "Властелин колец: Возвращение Короля", "Дж.Р.Р.Толкиен");
    private Book item4 = new Book(4, 1483, "Красное и черное", "Стендаль");
    private Smartphone item5 = new Smartphone(6, 15550, "Galaxy A10 32Gb", "Samsung");
    private Smartphone item6 = new Smartphone(7, 79990, "Iphone 12 64Gb", "Apple");
    private Smartphone item7 = new Smartphone(8, 890, "Nokia 3310", "Nokia");

    @BeforeEach
    public void setup() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
    }

    @Test
    public void shouldFindBookByAuthor() {
        Product[] actual = manager.searchBy("Стендаль");
        Product[] expected = new Product[]{item4};
        assertArrayEquals(expected, actual);
    }
}



