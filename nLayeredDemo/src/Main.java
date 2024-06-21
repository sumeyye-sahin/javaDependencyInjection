import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbsProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //todo: spring IoC ile iyileştirilecek
        ProductService productService = new ProductManager(new AbsProductDao(),new JLoggerManagerAdapter());

        Product product=new Product(1,2,"Elma",12,50);

        productService.add(product);
}}