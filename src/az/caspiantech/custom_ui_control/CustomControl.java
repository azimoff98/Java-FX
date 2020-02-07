package az.caspiantech.custom_ui_control;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CustomControl extends VBox {

    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    public CustomControl(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomControl.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getText(){
        return textProperty().get();
    }

    public void setText(String value){
        textProperty().set(value);
    }

    public StringProperty textProperty(){
        return textField.textProperty();
    }

    @FXML
    public void doSomething(){
        System.out.println("The button was clicked");
        textArea.setText(textField.getText());
    }

    @FXML
    public void setText(){
        textField.setText(getText());
    }
    @FXML
    public void test(){
        System.out.println("mouse entered");
    }

}
