package GUIControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SettingsController {

    @FXML
    private ImageView backToMainButton;

    @FXML
    void backToMain() throws IOException {
        Pane layout = FXMLLoader.load(getClass().getResource("/GUI/RegularCalc.fxml"));
        backToMainButton.getScene().setRoot(layout);
    }


    @FXML
    void openRegularCalc() throws IOException {
        Pane regularLayout = FXMLLoader.load(getClass().getResource("/GUI/RegularCalc.fxml"));
        backToMainButton.getScene().setRoot(regularLayout);
    }

    @FXML
    void openChildrenCalc() throws IOException {
        Pane childrenLayout = FXMLLoader.load(getClass().getResource("/GUI/ChildrenCalc.fxml"));
        backToMainButton.getScene().setRoot(childrenLayout);
    }

    @FXML
    void openITCalc() throws IOException {
        Pane ITLayout = FXMLLoader.load(getClass().getResource("/GUI/ITCalc.fxml"));
        backToMainButton.getScene().setRoot(ITLayout);
    }

    @FXML
    void OpenDateCalc() throws IOException {
        Pane dateLayout = FXMLLoader.load(getClass().getResource("/GUI/DateCalc.fxml"));
        backToMainButton.getScene().setRoot(dateLayout);
    }

    @FXML
    void openConverter() throws IOException {
        Pane converterLayout = FXMLLoader.load(getClass().getResource("/GUI/Converter.fxml"));
        backToMainButton.getScene().setRoot(converterLayout);
    }
}
