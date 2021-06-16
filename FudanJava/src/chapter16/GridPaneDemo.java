package chapter16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rst = null;
    Button first  =  new Button("第一条"),
            next  =  new Button("下一条"),
            prior =  new Button("前一条"),
            last  =  new Button("最后一条"),
            insert =  new Button("插入"),
            delete =  new Button("删除"),
            update =  new Button("修改");
    TextField id  = new TextField(),
            name  = new TextField(),
            brand = new TextField(),
            price = new TextField(),
            stock = new TextField();
    @Override
    public void init() {
        // 加载MySQL数据库驱动程序
        String dburl="jdbc:mysql://127.0.0.1:3306/webstore?user=root&password=password&useSSL=false";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dburl);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = stmt.executeQuery("SELECT * FROM products");
            rst.first();
            id.setText(rst.getString(1));
            name.setText(rst.getString(2));
            brand.setText(rst.getString(3));
            price.setText(rst.getDouble(4) + "");
            stock.setText(rst.getInt(5) + "");
        } catch(ClassNotFoundException cne) {
            cne.printStackTrace();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void start(Stage stage) {
        GridPane rootNode = new GridPane();
        rootNode.setHgap(10);
        rootNode.setVgap(10);
        rootNode.setPadding(new Insets(10, 10, 10, 10));
        rootNode.add(new Label("商品号"), 0, 0);
        rootNode.add(id, 1, 0);
        rootNode.add(new Label("商品名"), 2, 0);
        rootNode.add(name, 3, 0);
        rootNode.add(new Label("品牌"), 0, 1);
        rootNode.add(brand, 1, 1);
        rootNode.add(new Label("价格"), 2, 1);
        rootNode.add(price, 3, 1);
        rootNode.add(new Label("库存量"), 0, 2);
        rootNode.add(stock, 1, 2);

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().addAll(first, prior, next, last, insert, delete, update);
        rootNode.add(hbox, 0, 4, 4, 1);
        //为按钮编写事件处理代码
        first.setOnAction(e ->{
            try {
                rst.first();
                reset();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        prior.setOnAction(e ->{
            try {
                rst.previous();
                reset();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        next.setOnAction(e ->{
            try {
                rst.next();
                reset();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        last.setOnAction(e ->{
            try {
                rst.last();
                reset();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        insert.setOnAction(e ->{
            try {
                rst.moveToInsertRow();
                insert();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });

        update.setOnAction(e ->{
            try {
                update();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        delete.setOnAction(e ->{
            try {
                rst.deleteRow();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });
        //rootNode.setGridLinesVisible(true);
        Scene scene = new Scene(rootNode, 450, 180);
        stage.setTitle("访问数据库");
        stage.setScene(scene);
        stage.show();
    }
    private void reset() {
        try {
            id.setText(rst.getString(1));
            name.setText(rst.getString(2));
            brand.setText(rst.getString(3));
            price.setText(rst.getDouble(4) + "");
            stock.setText(rst.getInt(5) + "");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private void insert() {  // 插入记录方法
        try {
            String productid = id.getText();
            String pname = name.getText();
            String pbrand = brand.getText();
            double pprice = Double.parseDouble(price.getText());
            int pstock = Integer.parseInt(stock.getText());
            rst.updateString(1, productid);
            rst.updateString(2, pname);
            rst.updateString(3, pbrand);
            rst.updateDouble(4, pprice);
            rst.updateInt(5, pstock);
            rst.insertRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void update() {   // 修改记录方法
        try {
            String productid = id.getText();
            String pname = name.getText();
            String pbrand = brand.getText();
            double pprice = Double.parseDouble(price.getText());
            int pstock = Integer.parseInt(stock.getText());
            rst.updateString(1, productid);
            rst.updateString(2, pname);
            rst.updateString(3, pbrand);
            rst.updateDouble(4, pprice);
            rst.updateInt(5, pstock);
            rst.updateRow();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

