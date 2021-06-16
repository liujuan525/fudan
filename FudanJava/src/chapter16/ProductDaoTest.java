package chapter16;

import java.util.ArrayList;
import chapter16.dao.*;
import chapter16.entity.Product;

public class ProductDaoTest {
    public static void main(String[] args) {
        ProductDao dao = new ProductDaoImpl();
        Product product = new Product(109,"3G手机","Samsung",3500.00,10);
        ArrayList<Product> products = new ArrayList<Product>();
        try {
            dao.deleteProduct(108);
            dao.addProduct(product);          // 向表中插入一行记录
            products = dao.getAllProduct();   // 返回表中所有记录的数组列表
        } catch (DaoException e) {
            e.printStackTrace();
        }
        // 输出商品号大于104的商品信息
        products.stream().filter(p->p.getId() > 104).forEach(System.out::println);
    }
}
