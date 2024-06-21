package business.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    // iş interfaceleri service olarak verilir. service görürsen o iş interface dir
        void add(Product product);
        List<Product> getAll();
}
