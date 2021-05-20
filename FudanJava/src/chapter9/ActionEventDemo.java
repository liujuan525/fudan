package chapter9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class ActionEventDemo extends Application {
    Label label = new Label();
    Button ok = new Button("确定"),
            cancel = new Button("取消");

    @Override
    public void start(Stage stage) {
        // 为“确定”按钮注册事件处理器
        ok.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText("你单击了’确定’按钮");
            }
        });
        // 为“取消”按钮注册事件处理器
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText("你单击了’取消’按钮");
            }
        });

        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.getChildren().addAll(ok, cancel, label);
        Scene scene = new Scene(rootNode, 240, 100);
        stage.setTitle("事件处理示例");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
