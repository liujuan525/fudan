package chapter16.dao;

import java.sql.*;

public class MySQLDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cne) {
            System.out.println(cne);
        }
        String dburl = "jdbc:mysql://127.0.0.1:3306/webstore?useSSL=false";
        String sql = "INSERT INTO products VALUES(?,?,?,?,?)";
        try(
                Connection conn = DriverManager.getConnection(dburl,"root","password");
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setInt(1, 106);
            pstmt.setString(2,"MP4播放器");
            pstmt.setString(3,"Sony");
            pstmt.setFloat(4, 900.00F);
            pstmt.setInt(5, 2);

            int n = pstmt.executeUpdate();
            if (n == 1) {
                System.out.println("插入语句成功！");
            } else {
                System.out.println("语句执行失败！");
            }
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }

}
