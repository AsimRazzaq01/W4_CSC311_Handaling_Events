package org.example.w4_csc311_handaling_events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button myBtn1;

    @FXML
    private MenuItem myMenuItem1;

    @FXML
    private Label welcomeText;

    @FXML
    private ImageView myImage;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        welcomeText.setText("Hello Asim !");

    }


    Label lbl = new Label("");

    @FXML
    void openNewWindow(ActionEvent event) {
        Stage stage = new Stage();

        stage.initModality(Modality.WINDOW_MODAL);

        Button btn1 = new Button("1");
        btn1.setLayoutX(100);
        btn1.setLayoutY(100);


        Button btn2 = new Button("2");
        btn2.setLayoutX(130);
        btn2.setLayoutY(100);


        Button btn3 = new Button("3");
        btn3.setLayoutX(160);
        btn3.setLayoutY(100);

        // set on action for buttons
        btn1.setOnAction(this :: handleMyCalcButtons );
        btn2.setOnAction(this :: handleMyCalcButtons );
        btn3.setOnAction(this :: handleMyCalcButtons );



        Scene scene = new Scene(new Group(lbl,btn1, btn2, btn3),300,300);
        //Scene scene = new Scene(new Group(),300,300) ;
        stage.setScene(scene);
        stage.setTitle("About");
        stage.show();

    }

    private void handleMyCalcButtons(ActionEvent rrr) {

            lbl.setText(lbl.getText() +
                    ((Button)rrr.getSource()).getText() );

    }

}







// btn
//        btn3.setOnAction(rrr -> {
//            lbl.setText(lbl.getText() +  ((Button)rrr.getSource()).getText() );
//        } );



//image
//        myImage.setImage(new Image()
//                getClass(("file:resources/images/welcome.png").toExternalForm));

// myImage.setImage((new Image("file:resources/images/welcome.png")));