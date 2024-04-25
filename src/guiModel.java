import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.Objects;

public class guiModel {

    @FXML
    Label FastballVelo;

    @FXML
    Label ChangeUpVelo;

    @FXML
    Label BreakingBallVelo;

    @FXML
    CheckBox swing;

    @FXML
    ChoiceBox enterPitchType = new ChoiceBox();

    @FXML
    TextField enterVelo = new TextField();

    pitchLog log = new pitchLog();


    private Enum pitchLocation;

    private int pitchVelo;

    private Enum pitchType;

    String velo;

    public boolean checkSwing(){
        return  (swing.isSelected());
    }

    @FXML
    public void setPitchVelo(){
        this.velo = enterVelo.getText();
        if(!enterVelo.getText().isEmpty()) {
            this.pitchVelo = Integer.parseInt(velo);
        }
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
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Eleven(){
        this.pitchLocation = location.BallUpRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Twelve() {
        this.pitchLocation = location.BallDownLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Thirteen() {
        this.pitchLocation = location.BallDownRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void One() {
        this.pitchLocation = location.TopLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Two() {
        this.pitchLocation = location.TopMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Three() {
        this.pitchLocation = location.TopRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Four() {
        this.pitchLocation = location.MiddleLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Five() {
        this.pitchLocation = location.MiddleMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Six() {
        this.pitchLocation = location.MiddleRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Seven() {
        this.pitchLocation = location.BottomLeft;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Eight() {
        this.pitchLocation = location.BottomMiddle;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
    }
    @FXML
    private void Nine() {
        this.pitchLocation = location.BottomRight;
        log.addPitch(pitchLocation, pitchType, pitchVelo);
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));


    }

    @FXML
    public void initialize() {
        enterPitchType.getItems().addAll(pitchTypes.FASTBALL,pitchTypes.CHANGEUP,pitchTypes.BREAKINGBALL);
        enterPitchType.getSelectionModel().select(pitchTypes.CHANGEUP);
    }

}
