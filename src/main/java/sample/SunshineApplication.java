package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

public class SunshineApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        URL resource = getClass().getClassLoader().getResource("sample.fxml");
        if(resource != null) {
            Parent root = FXMLLoader.load(resource);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
