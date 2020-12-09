package controllers.nhanKhauController;
import beans.NhanKhauBean;
import controllers.SceneSwitch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.NhanKhauModel;
import services.NhanKhauService;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NhanKhauController implements Initializable {

    @FXML
    TableView<NhanKhauModel> table;
    @FXML
    TableColumn ID;
    @FXML
    TableColumn hoTen;
    @FXML
    TableColumn namSinh;
    @FXML
    TableColumn gioiTinh;
    @FXML
    TableColumn diaChiHienNay;


    private NhanKhauService nhanKhauService;
    private List<NhanKhauBean> listNhanKhauBeans;
    //ME added
    private ObservableList<NhanKhauModel> listNhanKhauForTable;
    private SceneSwitch sceneSwitch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nhanKhauService = new NhanKhauService();
        listNhanKhauBeans = nhanKhauService.getListNhanKhau();
        sceneSwitch = new SceneSwitch();
        setDataTable();
    }

    public void setDataTable(){
        List<NhanKhauModel> listItem = new ArrayList<>();
        listNhanKhauBeans.forEach(nhanKhau -> {
            listItem.add(nhanKhau.getNhanKhauModel());
        });
        listNhanKhauForTable = FXCollections.observableList(listItem);
        ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        hoTen.setCellValueFactory(new PropertyValueFactory<>("hoTen"));
        namSinh.setCellValueFactory(new PropertyValueFactory<>("namSinh"));
        gioiTinh.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
        diaChiHienNay.setCellValueFactory(new PropertyValueFactory<>("diaChiHienNay"));
        table.setItems(listNhanKhauForTable);
    }

    public void changeSceneHome(ActionEvent event) throws IOException {
        sceneSwitch.changeSceneHome(event);
    }

    public void changeSceneHoKhau(ActionEvent event) throws IOException {
        sceneSwitch.changeSceneHoKhau(event);
    }

    public void changeSceneThongKe(ActionEvent event) throws IOException {
        sceneSwitch.changeSceneThongKe(event);
    }

    public void changeSceneCovid(ActionEvent event) throws IOException {
        sceneSwitch.changeSceneCovid(event);
    }
}
