package controllers;

import controllers.SceneSwitch;
import controllers.covidController.SceneSwitchCovid;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.TestCovidModel;
import services.CovidService;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CovidController implements Initializable {
    @FXML
    TableView table;
    @FXML
    TableColumn ID;
    @FXML
    TableColumn hoTen;
    @FXML
    TableColumn thoiGianTest;
    @FXML
    TableColumn ketQuaTest;
    @FXML
    TableColumn hinhThucTest;

    SceneSwitch sceneSwitch;
    SceneSwitchCovid sceneSwitchCovid;
    CovidService covidService;
    ObservableList<TestCovidModel> testCovidModelList;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        sceneSwitch = new SceneSwitch();
        sceneSwitchCovid = new SceneSwitchCovid();
        covidService = new CovidService();

        List<TestCovidModel> testCovidList = covidService.getListTestCovid();
        testCovidModelList = FXCollections.observableList(testCovidList);
        ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        hoTen.setCellValueFactory(new PropertyValueFactory<>("hoTen"));
        thoiGianTest.setCellValueFactory(new PropertyValueFactory<>("thoiGianTest"));
        ketQuaTest.setCellValueFactory(new PropertyValueFactory<>("ketQuaTest"));
        hinhThucTest.setCellValueFactory(new PropertyValueFactory<>("hinhThucTest"));
        table.setItems(testCovidModelList);
    }

    public void themMoi(ActionEvent event) throws IOException {
        sceneSwitchCovid.changeSceneThemMoi(event);
    }

    public void khaiBaoCachLy(ActionEvent event) throws IOException{
        sceneSwitchCovid.changeSceneCachLy(event);
    }

    public void khaiBaoLoTrinh(ActionEvent event) throws IOException{
        sceneSwitchCovid.changeSceneLoTrinh(event);
    }

    public void khaiBaoSucKhoe(ActionEvent event) throws IOException{
        sceneSwitchCovid.changeSceneSucKhoe(event);
    }
    public void changeSceneHome(ActionEvent event) throws IOException {
        sceneSwitch.changeSceneHome(event);
    }

    public void changeSceneNhanKhau(ActionEvent event) throws IOException{
        sceneSwitch.changeSceneNhanKhau(event);
    }

    public void changeSceneThongKe(ActionEvent event) throws IOException{
        sceneSwitch.changeSceneThongKe(event);
    }

    public void changeSceneHoKhau(ActionEvent event) throws IOException{
        sceneSwitch.changeSceneNhanKhau(event);
    }
}
