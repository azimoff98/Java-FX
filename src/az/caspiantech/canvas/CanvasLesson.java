package az.caspiantech.canvas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CanvasLesson extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Canvas canvas = new Canvas(400,300);
        GraphicsContext context = canvas.getGraphicsContext2D();

        drawShapes(context);

        Group root = new Group();
        primaryStage.setTitle("Canvas Lesson");
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 400,300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.YELLOW);
        gc.setLineWidth(5);
        gc.strokeLine(40,10,10,40);
        gc.fillOval(10,60,30,30);
        gc.strokeOval(60,60,30,30);
        gc.fillRoundRect(110,60,30,30,10,10);
        gc.strokeRoundRect(160,60,30,30,10,10);
        gc.fillArc(10,110,30,30,45,240, ArcType.OPEN);
        gc.fillArc(60,110,30,30,45,240, ArcType.CHORD);
        gc.fillArc(110,110,30,30,45,240, ArcType.ROUND);
        gc.strokeArc(10,160,30,30,45,240, ArcType.OPEN);
        gc.strokeArc(60,160,30,30,45,240, ArcType.CHORD);
        gc.strokeArc(110,160,30,30,45,240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10,40,10,40}, new double[]{210,210,240,240}, 4);
        gc.strokePolygon(new double[]{60,90,60,90}, new double[]{210,210,240,240}, 4);
        gc.strokePolyline(new double[]{110,140,110,140}, new double[]{210,210,240,240}, 4);
    }

}
