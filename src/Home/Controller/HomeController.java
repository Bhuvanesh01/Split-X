package Home.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private Button Home;

    @FXML
    private Button JoinMenu;

    @FXML
    private Button SplitMenu;

    @FXML
    private Button Help;

    @FXML
    private Button About;

    @FXML
    private Button Close;

    @FXML
    private Button Join;

    @FXML
    private Button Split;

    @FXML
    private JFXButton BtnClose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void  HandleClicks(ActionEvent event)
    {
        if (event.getSource() == Home)
        {

        }
        else
            {

            }
        if (event.getSource() == JoinMenu)
        {

        }
        else
        {

        }
        if (event.getSource() == SplitMenu)
        {

        }
        else
        {

        }
        if (event.getSource() == Help)
        {

        }
        else
        {

        }
        if (event.getSource() == About)
        {

        }
        else
        {

        }
        if (event.getSource() == Join)
        {

        }
        else
        {

        }
        if (event.getSource() == Split)
        {

        }
        else
        {

        }
    }
    @FXML
    private void ExitApp(MouseEvent event)
    {
        if (event.getSource() == Close)
        {
            System.exit(0);
        }
        else if (event.getSource() == BtnClose)
        {
            System.exit(0);
        }
    }
}
