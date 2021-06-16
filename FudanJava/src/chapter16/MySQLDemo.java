package chapter16;

import java.sql.*;

public class MySQLDemo {
    public static void main(String[] args) throws Exception {
        // 加载MySQL数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException cne) {
            cne.printStackTrace();
        }
        String dburl = "jdbc:mysql://127.0.0.1:3306/webstore?useSSL=false";
        String sql = "SELECT * FROM products WHERE id < 104";
        try (Connection conn = DriverManager.getConnection(dburl,"root","password");
            Statement stmt = conn.createStatement();
            ResultSet rst = stmt.executeQuery(sql))
        {
            while(rst.next()) {
                System.out.println(rst.getInt(1) + "\t" + rst.getString(2) + "\t" + rst.getString(3) + "\t" + rst.getFloat(4) +"\t" + rst.getInt(5));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
