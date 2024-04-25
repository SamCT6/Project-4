import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.Objects;

public class guiModel {
    @FXML
    ProgressBar strikeBar;

    @FXML
    Label fastballStrike;

    @FXML
    Label ChangeUpStrike;

    @FXML
    Label BreakingBallStrike;

    @FXML
    Label strikePercentage;

    @FXML
    Label lastPitch;

    @FXML
    Label pitchCount;

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
        update();

    }
    @FXML
    private void Eleven(){
        this.pitchLocation = location.BallUpRight;
        update();
    }
    @FXML
    private void Twelve() {
        this.pitchLocation = location.BallDownLeft;
        update();
    }
    @FXML
    private void Thirteen() {
        this.pitchLocation = location.BallDownRight;
        update();
    }
    @FXML
    private void One() {
        this.pitchLocation = location.TopLeft;
        update();
    }
    @FXML
    private void Two() {
        this.pitchLocation = location.TopMiddle;
        update();
    }
    @FXML
    private void Three() {
        this.pitchLocation = location.TopRight;
        update();
    }
    @FXML
    private void Four() {
        this.pitchLocation = location.MiddleLeft;
        update();
    }
    @FXML
    private void Five() {
        this.pitchLocation = location.MiddleMiddle;
        update();
    }
    @FXML
    private void Six() {
        this.pitchLocation = location.MiddleRight;
        update();
    }
    @FXML
    private void Seven() {
        this.pitchLocation = location.BottomLeft;
        update();
    }
    @FXML
    private void Eight() {
        this.pitchLocation = location.BottomMiddle;
        update();
    }
    @FXML
    private void Nine() {
        this.pitchLocation = location.BottomRight;
        update();
    }

    private void update(){
        log.addPitch(pitchLocation, pitchType, pitchVelo, swing.isSelected());
        log.trackPitch(pitchVelo, pitchType);
        FastballVelo.setText(Integer.toString(log.fastballAvg()));
        ChangeUpVelo.setText(Integer.toString(log.changeUpAvg()));
        BreakingBallVelo.setText(Integer.toString(log.breakingBallAvg()));
        lastPitch.setText(log.seeLastPitch());
        pitchCount.setText(Integer.toString(log.pitchCount()));
        strikePercentage.setText(Float.toString(log.strikePercent()));
        fastballStrike.setText(Float.toString(log.fastballK()));
        ChangeUpStrike.setText(Float.toString(log.changUpK()));
        BreakingBallStrike.setText(Float.toString(log.breakingBallK()));
        strikeBar.setProgress(log.strikePercent());

    }

    @FXML
    public void initialize() {
        enterPitchType.getItems().addAll(pitchTypes.FASTBALL,pitchTypes.CHANGEUP,pitchTypes.BREAKINGBALL);
        enterPitchType.getSelectionModel().select(pitchTypes.CHANGEUP);
    }

}
