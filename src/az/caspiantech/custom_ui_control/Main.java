package az.caspiantech.custom_ui_control;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberTextField numberTextField = new NumberTextField();
        Group root = new Group();
        root.getChildren().add(numberTextField);


        CustomControl customControl = new CustomControl();

        root.getChildren().add(customControl);

        primaryStage.setScene(new Scene(root, 500,500));
        primaryStage.show();
    }


}
