package az.caspiantech.layout;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class AnchorPaneLesson extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        AnchorPane anchorPane = new AnchorPane();
        AnchorPane.setBottomAnchor(new TextArea("TEXT"), 10.0);
        anchorPane.getChildren().addAll(new Button("Start"));

        root.getChildren().addAll(anchorPane);
        primaryStage.setScene(new Scene(root, 600,800));
        primaryStage.show();
    }
}
