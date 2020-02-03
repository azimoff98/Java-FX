package az.caspiantech.intro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        primaryStage.setTitle("Hello World");

        Line line = new Line(0,0,500,500);
        line.setFill(Color.GREEN);
        line.setStroke(Color.YELLOW);
        line.setStrokeWidth(5);
        line.setStrokeType(StrokeType.CENTERED);
        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle(75, 90);
        rectangle.setStroke(Color.RED);
        rectangle.setFill(Color.ORANGE);
        root.getChildren().add(rectangle);


        Text text = new Text(600, 500, "HELLO WORLD");
        text.setBoundsType(TextBoundsType.LOGICAL_VERTICAL_CENTER);
        text.setLineSpacing(10);
        text.setUnderline(true);
        text.setStrikethrough(true);
        text.setFill(Color.BLUE);
        text.setFont(Font.font(20));
        root.getChildren().add(text);

        primaryStage.setScene(new Scene(root, 1600, 1600));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("Before Starting");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Before Stopping");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
