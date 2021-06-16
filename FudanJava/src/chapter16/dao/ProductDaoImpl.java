package chapter16.dao;

import java.sql.*;
import java.util.ArrayList;
import chapter16.entity.Product;

public class ProductDaoImpl implements ProductDao {
    // 添加商品方法
    public void addProduct(Product product) throws DaoException {
        String sql = "INSERT INTO products VALUES(?,?,?,?,?)";
        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setInt(1, product.getId());
            pstmt.setString(2, product.getPname());
            pstmt.setString(3, product.getBrand());
            pstmt.setDouble(4, product.getPrice());
            pstmt.setInt(5, product.getStock());
            pstmt.executeUpdate();
        } catch(SQLException se) {
            se.printStackTrace();
        }
    }
    // 修改商品方法
    public void updateProduct(Product product) throws DaoException {
        String sql = "UPDATE products SET pname=?," + "brand = ?,price = ?,stock=? WHERE id=?";
        try (Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, product.getPname());
            pstmt.setString(2, product.getBrand());
            pstmt.setDouble(3, product.getPrice());
            pstmt.setInt(4, product.getStock());
            pstmt.setInt(5, product.getId());
            pstmt.executeUpdate();
        } catch(SQLException se) {
            se.printStackTrace();
        }
    }
    // 删除商品方法
    public void deleteProduct(int pid) throws DaoException {
        String sql = "DELETE FROM products WHERE id =?";
        try (Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, pid);
            pstmt.executeUpdate();
        } catch(SQLException se) {
            se.printStackTrace();
        }
    }
    // 查询商品方法
    public Product getProduct(int pid) throws DaoException {
        String sql = "SELECT * FROM products WHERE id =?";
        ResultSet resultSet = null;
        Product product = null;
        try ( Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setInt(1, pid);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                product = new Product(
                        resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getDouble(4),
                        resultSet.getInt(5));
            }
        } catch(SQLException se) {
            se.printStackTrace();
        }
        return product;
    }
    // 查询所有商品方法
    public ArrayList<Product> getAllProduct() throws DaoException {
        String sql = "SELECT * FROM products";
        ResultSet resultSet = null;
        ArrayList<Product> products = new ArrayList<Product>();
        Product product = null;
        try (Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                product = new Product(
                        resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getDouble(4),
                        resultSet.getInt(5));
                products.add(product);
            }
        } catch(SQLException se) {
            se.printStackTrace();
        }
        return products;
    }
}
