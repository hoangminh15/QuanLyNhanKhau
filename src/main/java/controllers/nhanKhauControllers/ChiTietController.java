package controllers.nhanKhauControllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import models.NhanKhauModel;
import services.CovidService;

import java.net.URL;
import java.util.ResourceBundle;

public class ChiTietController implements Initializable {
    @FXML
    Label hoTen;
    @FXML
    Label namSinh;
    @FXML
    Label gioiTinh;
    @FXML
    Label nguyenQuan;
    @FXML
    Label danToc;
    @FXML
    Label tonGiao;
    @FXML
    Label quocTich;
    @FXML
    Label soCMT;

    CovidService covidService;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        covidService = new CovidService();

    }

    public void setData(NhanKhauModel nhanKhauModel) {
        String cmtFromID = covidService.getCMTfromID(nhanKhauModel.getID());
        hoTen.setText(nhanKhauModel.getHoTen());
        namSinh.setText(String.valueOf(nhanKhauModel.getNamSinh()));
        gioiTinh.setText(nhanKhauModel.getGioiTinh());
        nguyenQuan.setText(nhanKhauModel.getNguyenQuan());
        danToc.setText(nhanKhauModel.getDanToc());
        tonGiao.setText(nhanKhauModel.getTonGiao());
        quocTich.setText(nhanKhauModel.getQuocTich());
        soCMT.setText(cmtFromID);
    }
}
