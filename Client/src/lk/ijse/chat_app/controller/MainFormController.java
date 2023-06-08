package lk.ijse.chat_app.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainFormController {
    public TextField txt_userName;
    public JFXButton btn_start;

    public static ArrayList<String>nameList=new ArrayList<>();

    public void txt_userNameOnAction(ActionEvent actionEvent) {
        btn_startOnAction(actionEvent);
    }

    public void btn_startOnAction(ActionEvent actionEvent) {
        nameList.add(txt_userName.getText());

        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../view/App.fxml"));
        Parent load = null;
        try {
            load = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        AppController appController = fxmlLoader.getController();
//        appController.setClientUserName(txt_userName.getText());
        Stage stage = new Stage();
        stage.setTitle("Group Chat");
        stage.setScene(new Scene(load));
        stage.centerOnScreen();
        //stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        txt_userName.clear();
    }
}
