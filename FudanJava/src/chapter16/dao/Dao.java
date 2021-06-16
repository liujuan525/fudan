package chapter16.dao;

import java.sql.*;

public interface Dao {
    // 接口中定义的默认方法
    public default Connection getConnection() throws DaoException {
        String dburl = "jdbc:mysql://127.0.0.1:3306/webstore?useSSL=false";
        String username = "root";
        String password = "password";
        try {
            return DriverManager.getConnection(dburl, username, password);
        } catch (SQLException e) {
            throw new DaoException();
        }
    }
    
}
