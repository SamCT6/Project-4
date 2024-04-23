import javafx.fxml.FXML;

public class guiModel {

    private Enum pitchLocation;
    @FXML
    private void Ten(){
        this.pitchLocation = location.BallUpLeft;
    }
    @FXML
    private void Eleven(){
        this.pitchLocation = location.BallUpRight;
    }
    @FXML
    private void Twelve() {
        this.pitchLocation = location.BallDownLeft;
    }
    @FXML
    private void Thirteen() {
        this.pitchLocation = location.BallDownRight;
    }
    @FXML
    private void One() {
        this.pitchLocation = location.TopLeft;
    }
    @FXML
    private void Two() {
        this.pitchLocation = location.TopMiddle;
    }
    @FXML
    private void Three() {
        this.pitchLocation = location.TopRight;
    }
    @FXML
    private void Four() {
        this.pitchLocation = location.MiddleLeft;
    }
    @FXML
    private void Five() {
        this.pitchLocation = location.MiddleMiddle;
    }
    @FXML
    private void Six() {
        this.pitchLocation = location.MiddleRight;
    }
    @FXML
    private void Seven() {
        this.pitchLocation = location.BottomLeft;
    }
    @FXML
    private void Eight() {
        this.pitchLocation = location.BottomMiddle;
    }
    @FXML
    private void Nine() {
        this.pitchLocation = location.BottomRight;
    }
}
