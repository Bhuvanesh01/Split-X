package Home.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SplitController implements Initializable {
    private double x, y;
    String Path = null;
    @FXML
    private Button Browse;

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
    private JFXButton BtnClose;

    @FXML
    private TextField txt;


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
            Scene SplitScene = new Scene(JoinParent);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(SplitScene);
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
        if (event.getSource() == Browse)
        {
            FileChooser fc = new FileChooser();
            File SelectedFile = fc.showOpenDialog(null);
            if (SelectedFile != null)
            {
                txt.setText(SelectedFile.getAbsolutePath());
                Path = txt.getText();
            }
            else
            {
                System.out.println("Not A Valid File");
            }
        }

    }
    @FXML
    public Void Splitit(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Your Files Splitted Successfully!!");
        alert.setHeight(100);
        alert.setWidth(150);
        try{
        //Create Byte Array with 10,00,000 bytes size
        byte b[] = new byte[1000000];
        int x=1, j=0;
        String s = "";
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ins);
        FileInputStream fis = new FileInputStream(Path);
        int read_bytes;
        while(fis.available()!=0){
            j=0;
            s="";
            if(x<=9){
                s = Path+".00"+x; // FileName.mp4.001, FileName.mp4.002, ...... , FileName.mp4.009
            }

            else{
                s = Path+".0"+x; // FileName.mp4.010, FileName.mp4.011, ...... so on
            }
            FileOutputStream fos = new FileOutputStream(s);
            while(j<=50000000 && fis.available()!=0) {
                read_bytes = fis.read(b, 0, 1000000);
                j = j + read_bytes;
                fos.write(b, 0, read_bytes);
            }
            System.out.println("Part "+x+" Created.");
            x++;
        } // End of Outer While Loop
            alert.show();
        fis.close();

    }
    catch(Exception e){
        e.printStackTrace();
    }
        return null;
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



