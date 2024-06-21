package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {


    // dependency injection: productDao gevşek bağlı
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }



    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");

            return; // alt satırlara inme bu şart geçerli değilse demek
        }

        this.productDao.add(product);
        this.loggerService.logToSystem(product.getName() );


    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }
}
