package controllers.nhanKhauController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitchNhanKhau {
    private Stage stage;
    private FXMLLoader loader;
    private Parent parent;
    private Scene scene;

    public void changeSceneThemMoi(ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NhanKhau/ThemMoi.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Thêm mới nhân khẩu");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneTamVang(ActionEvent event) throws IOException{
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NhanKhau/TamVang.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Đăng ký tạm vắng");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneTamTru(ActionEvent event) throws IOException{
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NhanKhau/TamTru.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Đăng ký tạm trú");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }

    public void changeSceneKhaiTu(ActionEvent event) throws IOException{
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage popUpStage = new Stage();
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/NhanKhau/KhaiTu.fxml"));
        parent = loader.load();
        scene = new Scene(parent);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.initOwner(stage);
        popUpStage.setTitle("Khai tử");
        popUpStage.setScene(scene);
        popUpStage.centerOnScreen();
        popUpStage.show();
    }
}
