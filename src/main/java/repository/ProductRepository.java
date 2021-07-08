package repository;

import domain.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import exception.NotFoundException;

@Data
@RequiredArgsConstructor

public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        int resultLength = products.length + 1;
        Product[] tmp = new Product[resultLength];
        System.arraycopy(products, 0, tmp, 0, products.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) ;
            return product;
        }
        return null;
    }


    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("ID " + id + " not found!");
        }
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }
}


