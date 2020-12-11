package controllers.covidController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitchCovid {
    private Stage stage;
    private FXMLLoader loader;
    private Parent parent;
    private Scene scene;

    public void changeSceneCachLy(ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Covid/KhaiBaoCachLy.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Khai báo cách ly");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneLoTrinh (ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Covid/KhaiBaoLoTrinh.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Khai báo lộ trình");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneSucKhoe (ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Covid/ThemMoi.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Khai báo sức khỏe");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneThemMoi (ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Covid/KhaiBaoSucKhoe.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Khai báo sức khỏe");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

}
