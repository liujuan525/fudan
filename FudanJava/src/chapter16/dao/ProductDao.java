package chapter16.dao;

import java.util.ArrayList;
import chapter16.entity.Product;

public interface ProductDao extends Dao {
    public void addProduct(Product product) throws DaoException;
    public void updateProduct(Product product) throws DaoException;
    public void deleteProduct(int pid) throws DaoException;
    public Product getProduct(int pid) throws DaoException;
    public ArrayList<Product> getAllProduct() throws DaoException;
}
