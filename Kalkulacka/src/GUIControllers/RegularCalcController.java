package GUIControllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class RegularCalcController {

    private byte actualFloor;

    @FXML
    private ImageView menuSettings;

    @FXML
    private JFXButton buttonSquareRoot;

    @FXML
    private JFXButton button10TimesX;

    @FXML
    private JFXButton buttonLog;

    @FXML
    private JFXButton buttonLn;

    @FXML
    private JFXButton buttonDeg;

    @FXML
    private JFXButton buttonPercent;

    @FXML
    private JFXButton buttonXTimesY;

    @FXML
    private JFXButton buttonSinus;

    @FXML
    private JFXButton buttonCosinus;

    @FXML
    private JFXButton buttonTangent;

    @FXML
    private JFXButton buttonYRootOfX;

    @FXML
    private JFXButton buttonCombination;

    @FXML
    private JFXButton buttonVariation;

    @FXML
    private JFXButton buttonPermutation;

    @FXML
    private JFXButton buttonRad;

    @FXML
    private JFXButton button1DevidedX;

    @FXML
    private JFXButton buttonRepeat;

    @FXML
    private JFXButton buttonSinusInverse;

    @FXML
    private JFXButton buttonCosinusInverse;

    @FXML
    private JFXButton buttonTangentInverse;

    @FXML
    void showNextFloor() {
        actualFloor++;
        switch (actualFloor){
            case 0:
                //show all buttons on the 0 floor
                buttonPercent.setVisible(true);
                buttonXTimesY.setVisible(true);
                buttonSinus.setVisible(true);
                buttonCosinus.setVisible(true);
                buttonTangent.setVisible(true);
                buttonSquareRoot.setVisible(true);
                button10TimesX.setVisible(true);
                buttonLog.setVisible(true);
                buttonLn.setVisible(true);
                buttonDeg.setVisible(true);

                //hide all buttons on the 1st floor
                button1DevidedX.setVisible(false);
                buttonRepeat.setVisible(false);
                buttonSinusInverse.setVisible(false);
                buttonCosinusInverse.setVisible(false);
                buttonTangentInverse.setVisible(false);
                buttonYRootOfX.setVisible(false);
                buttonCombination.setVisible(false);
                buttonVariation.setVisible(false);
                buttonPermutation.setVisible(false);
                buttonRad.setVisible(false);
                break;
            case 1:
                //show all buttons on the 1st floor
                button1DevidedX.setVisible(true);
                buttonRepeat.setVisible(true);
                buttonSinusInverse.setVisible(true);
                buttonCosinusInverse.setVisible(true);
                buttonTangentInverse.setVisible(true);
                buttonYRootOfX.setVisible(true);
                buttonCombination.setVisible(true);
                buttonVariation.setVisible(true);
                buttonPermutation.setVisible(true);
                buttonRad.setVisible(true);

                //hide all buttons on the 0 floor
                buttonPercent.setVisible(false);
                buttonXTimesY.setVisible(false);
                buttonSinus.setVisible(false);
                buttonCosinus.setVisible(false);
                buttonTangent.setVisible(false);
                buttonSquareRoot.setVisible(false);
                button10TimesX.setVisible(false);
                buttonLog.setVisible(false);
                buttonLn.setVisible(false);
                buttonDeg.setVisible(false);

                actualFloor = -1; //reached the highest floor, so after next click we need to get back on 0 floor
                break;
        }
    }

    @FXML
    void openDatabase() {

    }

    @FXML
    void openGraph() {

    }

    @FXML
    void openHistory() {

    }

    @FXML
    void openSettings() throws IOException {
        Pane settingsLayout = FXMLLoader.load(getClass().getResource("/GUI/Settings.fxml"));
        buttonRad.getScene().setRoot(settingsLayout);
    }
}
