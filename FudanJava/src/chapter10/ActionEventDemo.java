package chapter10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ActionEventDemo extends Application {
    Button button = new Button("确定");
    @Override
    public void start(Stage stage) {
        // 为“确定”按钮注册事件处理器
        button.setOnAction(	event->
                System.out.println("Hello World")
        );

        // 创建根节点和场景
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getChildren().addAll(button);
        Scene scene = new Scene(rootNode, 240, 100);
        stage.setTitle("事件处理示例");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
