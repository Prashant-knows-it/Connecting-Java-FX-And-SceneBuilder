import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label myMessage;

    public void generateRandom(ActionEvent event) {
        Random ran = new Random();
        int myran = ran.nextInt(50) + 1;
        myMessage.setText(Integer.toString(myran));
    }
}
