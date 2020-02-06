package az.caspiantech.layout;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new Button("press"));
        borderPane.setBottom(new TextArea("input"));
        borderPane.setTop(new CheckBox("CHECK"));
        borderPane.setLeft(new RadioButton("MARK"));
        borderPane.setRight(new ComboBox<>());

        borderPane.setMinHeight(400);
        borderPane.setMinWidth(300);


        root.getChildren().addAll(borderPane);
        primaryStage.setScene(new Scene(root,1600,1600));
        primaryStage.setTitle("LAYOUT");
        primaryStage.show();
    }
}
