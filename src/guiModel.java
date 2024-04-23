import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.Objects;

public class guiModel {

    @FXML
    CheckBox swing;

    @FXML
    ChoiceBox enterPitchType = new ChoiceBox();

    @FXML
    TextField enterVelo;

    pitchLog log = new pitchLog();

    private Enum pitchLocation;

    private int pitchVelo;

    private Enum pitchType;

    public boolean checkSwing(){
        return  (swing.isSelected());
    }

    @FXML
    private void setPitchVelo(){
        this.pitchVelo = Integer.getInteger(enterVelo.toString());
    }


    @FXML
    private void setPitchType(){
        if (Objects.equals(enterPitchType.getSelectionModel().getSelectedItem(), pitchTypes.FASTBALL)){
            this.pitchType = pitchTypes.FASTBALL;
        }
        else if (Objects.equals(enterPitchType.getSelectionModel().getSelectedItem(), pitchTypes.CHANGEUP)){
            this.pitchType = pitchTypes.CHANGEUP;
        }
        else{
            this.pitchType = pitchTypes.BREAKINGBALL;
        }
    }
    @FXML
    private void Ten(){
        this.pitchLocation = location.BallUpLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Eleven(){
        this.pitchLocation = location.BallUpRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Twelve() {
        this.pitchLocation = location.BallDownLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Thirteen() {
        this.pitchLocation = location.BallDownRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void One() {
        this.pitchLocation = location.TopLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Two() {
        this.pitchLocation = location.TopMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Three() {
        this.pitchLocation = location.TopRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Four() {
        this.pitchLocation = location.MiddleLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Five() {
        this.pitchLocation = location.MiddleMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Six() {
        this.pitchLocation = location.MiddleRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Seven() {
        this.pitchLocation = location.BottomLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Eight() {
        this.pitchLocation = location.BottomMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }
    @FXML
    private void Nine() {
        this.pitchLocation = location.BottomRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
    }

    @FXML
    public void initialize() {
        enterPitchType.getItems().addAll(pitchTypes.FASTBALL,pitchTypes.CHANGEUP,pitchTypes.BREAKINGBALL);
        enterPitchType.getSelectionModel().select(pitchTypes.CHANGEUP);
    }

}
