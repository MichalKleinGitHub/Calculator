import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane layout = FXMLLoader.load(getClass().getResource("/GUI/RegularCalc.fxml"));
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setHeight(530);
        primaryStage.setWidth(355);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
