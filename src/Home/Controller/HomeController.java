package Home.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private double x, y;

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
    private void  HandleClicks(ActionEvent event) throws IOException
    {
        if (event.getSource() == Home)
        {
            Parent HomeParent = FXMLLoader.load(getClass().getResource("../FXML/Home.fxml"));
            Scene HomeScene = new Scene(HomeParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(HomeScene);
            window.show();
            HomeParent.setOnMousePressed(event1 -> {
                x = event1.getSceneX();
                y = event1.getSceneY();
            });
            HomeParent.setOnMouseDragged(event1 -> {

                window.setX(event1.getScreenX() - x);
                window.setY(event1.getScreenY() - y);

            });
        }
        else
            {

            }
        if (event.getSource() == JoinMenu)
        {
            Parent JoinParent = FXMLLoader.load(getClass().getResource("../FXML/Join.fxml"));
            Scene JoinScene = new Scene(JoinParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(JoinScene);
            window.show();
            JoinParent.setOnMousePressed(event1 -> {
                x = event1.getSceneX();
                y = event1.getSceneY();
            });
            JoinParent.setOnMouseDragged(event1 -> {

                window.setX(event1.getScreenX() - x);
                window.setY(event1.getScreenY() - y);

            });
        }
        else
        {

        }
        if (event.getSource() == SplitMenu)
        {
            Parent SplitParent = FXMLLoader.load(getClass().getResource("../FXML/Split.fxml"));
            Scene SplitScene = new Scene(SplitParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(SplitScene);
            window.show();
            SplitParent.setOnMousePressed(event1 -> {
                x = event1.getSceneX();
                y = event1.getSceneY();
            });
            SplitParent.setOnMouseDragged(event1 -> {

                window.setX(event1.getScreenX() - x);
                window.setY(event1.getScreenY() - y);

            });
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
            Parent JoinParent = FXMLLoader.load(getClass().getResource("../FXML/Join.fxml"));
            Scene JoinScene = new Scene(JoinParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(JoinScene);
            window.show();
            JoinParent.setOnMousePressed(event1 -> {
                x = event1.getSceneX();
                y = event1.getSceneY();
            });
            JoinParent.setOnMouseDragged(event1 -> {

                window.setX(event1.getScreenX() - x);
                window.setY(event1.getScreenY() - y);

            });
        }
        else
        {

        }
        if (event.getSource() == Split)
        {
            Parent SplitParent = FXMLLoader.load(getClass().getResource("../FXML/Split.fxml"));
            Scene SplitScene = new Scene(SplitParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(SplitScene);
            window.show();
            SplitParent.setOnMousePressed(event1 -> {
                x = event1.getSceneX();
                y = event1.getSceneY();
            });
            SplitParent.setOnMouseDragged(event1 -> {

                window.setX(event1.getScreenX() - x);
                window.setY(event1.getScreenY() - y);

            });
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
