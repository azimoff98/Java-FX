package az.caspiantech.ui_controls;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * For detailed information
 * @see <a href = "https://docs.oracle.com/javafx/2/ui_controls/jfxpub-ui_controls.htm"></a>
 */
public class CheckBox extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        GridPane gridPane = new GridPane();
        gridPane.add(createChoiceBox(), 25,60);
//        gridPane.add(createChoiceBox(), 9,9);
        root.getChildren().addAll(gridPane);

        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }

    private ChoiceBox createChoiceBox(){
        ChoiceBox ch = new ChoiceBox(FXCollections.observableArrayList(
                "First", "Second", "Third"
        ));
        return ch;
    }
}
