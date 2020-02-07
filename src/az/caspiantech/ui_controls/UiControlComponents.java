package az.caspiantech.ui_controls;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * For detailed information
 * @see <a href = "https://docs.oracle.com/javafx/2/ui_controls/jfxpub-ui_controls.htm"></a>
 */
public class UiControlComponents extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));

        gridPane.add(createCheckBox("CHECKBOX 1"), 0, 0,1,1);
        gridPane.add(createCheckBox("CHECKBOX 2"), 1, 0,1,1);
        gridPane.add(createRadioButton("RadioButton 1"), 2, 0,1,1);
        gridPane.add(createRadioButton("RadioButton 2"), 3, 0,1,1);
        gridPane.add(createToggleButton("Toggle Button 1"), 4, 0,1,1);
        gridPane.add(createToggleButton("Toggle Button 2"), 5, 0,1,1);
        gridPane.add(createChoiceBox("Choice Box 1"), 0, 1,1,1);
        gridPane.add(createScrollBar(), 1,1,1,1);
        gridPane.add(createListView(), 2, 1, 1, 1);
        gridPane.add(createTableView(), 3, 1, 1,1);



        root.getChildren().add(gridPane);

        primaryStage.setScene(new Scene(root, 1200, 1200));
        primaryStage.show();
    }

    private ChoiceBox createChoiceBox(String text){
        ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList(
                "First", "Second", "Third"
        ));
        choiceBox.setAccessibleText(text);
        return choiceBox;
    }

    private CheckBox createCheckBox(String text){
        CheckBox checkBox = new CheckBox();
        checkBox.setText(text);
        checkBox.setPadding(createInsets());

        return checkBox;
    }

    private RadioButton createRadioButton(String text){
        RadioButton radioButton = new RadioButton();
        radioButton.setText(text);
        radioButton.setPadding(createInsets());

        return radioButton;
    }

    private ToggleButton createToggleButton(String text){
        ToggleButton toggleButton = new ToggleButton();
        toggleButton.setText(text);
        toggleButton.setPadding(createInsets());

        return toggleButton;
    }

    private ScrollBar createScrollBar(){
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setPadding(createInsets());
        return scrollBar;
    }

    private ScrollPane createScrollPane(){
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPadding(createInsets());
        return scrollPane;
    }

    private Insets createInsets(){
        return new Insets(10,10,10,10);
    }

    private ListView<String> createListView(){
        ListView<String> listView = new ListView<>();
        listView.setItems(FXCollections.observableArrayList("First", "Second" ,"Third", "Fourth"));
        listView.setPadding(createInsets());
        listView.setPrefWidth(200);
        listView.setPrefHeight(100);
        return listView;
    }

    private TableView<String> createTableView(){
        TableView<String> table = new TableView<>();
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(createInsets());
        vbox.getChildren().addAll(label, table);
        return table;
    }
}
