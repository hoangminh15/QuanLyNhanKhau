package controllers;

import controllers.covidControllers.SceneSwitchCovid;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
    @FXML
    Button themButton;
    @FXML
    Button khaiBaoCachLyButton;
    @FXML
    Button khaiBaoLoTrinhButton;
    @FXML
    Button khaiBaoSucKhoeButton;

    SceneSwitch sceneSwitch;
    SceneSwitchCovid sceneSwitchCovid;
    CovidService covidService;
    ObservableList<TestCovidModel> testCovidModelList;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        khaiBaoCachLyButton.setDisable(true);
        khaiBaoLoTrinhButton.setDisable(true);
        khaiBaoSucKhoeButton.setDisable(true);

        themButton.setStyle("-fx-background-color: #0063B7; -fx-text-fill: white");

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

    public void selectRow(MouseEvent event) throws IOException {
        TestCovidModel testCovidModel = (TestCovidModel) table.getSelectionModel().getSelectedItem();
        if(testCovidModel != null){
            khaiBaoSucKhoeButton.setDisable(false);
            khaiBaoLoTrinhButton.setDisable(false);
            khaiBaoCachLyButton.setDisable(false);
        } else {
            khaiBaoSucKhoeButton.setDisable(true);
            khaiBaoLoTrinhButton.setDisable(true);
            khaiBaoCachLyButton.setDisable(true);
        }

        if(event.getClickCount() == 2 && testCovidModel != null){
            sceneSwitchCovid.changeSceneChiTiet(event, testCovidModel);
        }
    }

    public void themMoi(ActionEvent event) throws IOException {
        sceneSwitchCovid.changeSceneThemMoi(event);
    }

    public void khaiBaoCachLy(ActionEvent event) throws IOException{
        TestCovidModel testCovidModel = (TestCovidModel) table.getSelectionModel().getSelectedItem();
        sceneSwitchCovid.changeSceneCachLy(event, testCovidModel);
    }

    public void khaiBaoLoTrinh(ActionEvent event) throws IOException{
        TestCovidModel testCovidModel = (TestCovidModel) table.getSelectionModel().getSelectedItem();
        sceneSwitchCovid.changeSceneLoTrinh(event, testCovidModel);
    }

    public void khaiBaoSucKhoe(ActionEvent event) throws IOException{
        TestCovidModel testCovidModel = (TestCovidModel) table.getSelectionModel().getSelectedItem();
        sceneSwitchCovid.changeSceneSucKhoe(event, testCovidModel);
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
