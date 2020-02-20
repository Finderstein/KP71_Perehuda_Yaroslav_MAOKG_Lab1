package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Main extends Application {
    private final static short WIDTH = 600;
    private final static short HEIGHT = 500;
    Color violet = Color.rgb(128,128,255);
    Color white = Color.rgb(255,255,255);
    Color orange = Color.rgb(255,128,64);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab1");

        Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setFill(violet);

        Rectangle rocketBody = new Rectangle(150,200,300,70);
        rocketBody.setFill(white);
        root.getChildren().add(rocketBody);

        Polygon triangle = new Polygon(450.0, 200.0,
                510.0, 235.0,
                450.0, 270.0
        );

        triangle.setFill(orange);
        root.getChildren().add(triangle);

        Rectangle centralWing = new Rectangle(150,230,100,10);
        centralWing.setFill(orange);
        root.getChildren().add(centralWing);

        Polygon topWing = new Polygon(150.0, 150.0, 210.0, 150.0, 250.0, 200, 190.0, 200.0);
        topWing.setFill(orange);
        root.getChildren().add(topWing);

        Polygon bottomWing = new Polygon(150, 320.0, 190.0, 270.0, 250.0, 270.0, 210.0, 320.0);
        bottomWing.setFill(orange);
        root.getChildren().add(bottomWing);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
