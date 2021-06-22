package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import repository.ProductRepository;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class ProductManager {
    private ProductRepository repository;

    public void save(Product product) {
        repository.save(product);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(product, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (((Book) product).getAuthor().contains(search)) {
                return true;
            }
            if (product.getName().contains(search)) {
                return true;
            }
            return false;
        }

        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (((Smartphone) product).getVendor().contains(search)) {
                return true;
            }
            if (product.getName().contains(search)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
