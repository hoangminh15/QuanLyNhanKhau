package controllers.covidController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.KhaiBaoCachLyModel;
import models.KhaiBaoLoTrinhModel;
import models.KhaiBaoSucKhoeModel;
import models.TestCovidModel;
import services.CovidService;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ChiTietController {
    @FXML
    Label ID;
    @FXML
    Label hoTen;
    @FXML
    TableView cachLyTable;
    @FXML
    TableView loTrinhTable;
    @FXML
    TableColumn thoiGianBatDauCachLy;
    @FXML
    TableColumn thoiGianKetThucCachLy;
    @FXML
    TableColumn mucDo;
    @FXML
    TableColumn diaDiemCachLy;
    @FXML
    TableColumn thoiGianBatDauLoTrinh;
    @FXML
    TableColumn thoiGianKetThucLoTrinh;
    @FXML
    TableColumn diaDiem;
    @FXML
    Label trieuChung;
    @FXML
    Label nguoiTiepXuc;
    @FXML
    Label tieuSuBenh;

    CovidService covidService;
    List<KhaiBaoCachLyModel> khaiBaoCachLyModels;
    List<KhaiBaoLoTrinhModel> khaiBaoLoTrinhModels;
    KhaiBaoSucKhoeModel khaiBaoSucKhoeModel;
    int id;

    public void setDataChiTiet(){
        id = Integer.parseInt(ID.getText().trim());
        covidService = new CovidService();
        khaiBaoCachLyModels = covidService.getKhaiBaoCachLyByID(id);
        khaiBaoLoTrinhModels = covidService.getKhaiBaoLoTrinhByID(id);

        ObservableList khaiBaoCachLy = FXCollections.observableList(khaiBaoCachLyModels);
        thoiGianBatDauCachLy.setCellValueFactory(new PropertyValueFactory<>("thoiGianBatDau"));
        thoiGianKetThucCachLy.setCellValueFactory(new PropertyValueFactory<>("thoiGianKetThuc"));
        mucDo.setCellValueFactory(new PropertyValueFactory<>("mucDo"));
        diaDiemCachLy.setCellValueFactory(new PropertyValueFactory<>("diaDiemCachLy"));
        cachLyTable.setItems(khaiBaoCachLy);

        ObservableList khaiBaoLoTrinh = FXCollections.observableList(khaiBaoLoTrinhModels);
        thoiGianBatDauLoTrinh.setCellValueFactory(new PropertyValueFactory<>("thoiGianBatDau"));
        thoiGianKetThucLoTrinh.setCellValueFactory(new PropertyValueFactory<>("thoiGianKetThuc"));
        diaDiem.setCellValueFactory(new PropertyValueFactory<>("diaDiem"));
        loTrinhTable.setItems(khaiBaoLoTrinh);

        khaiBaoLoTrinhModels = covidService.getKhaiBaoLoTrinhByID(id);

        khaiBaoSucKhoeModel = covidService.getKhaiBaoSucKhoeByID(id);
        trieuChung.setText(khaiBaoSucKhoeModel.getTrieuChung());
        nguoiTiepXuc.setText(khaiBaoSucKhoeModel.getNguoiTiepXuc());
        tieuSuBenh.setText(khaiBaoSucKhoeModel.getTieuSuBenh());
    }

    public void setData(TestCovidModel testCovidModel){
        ID.setText(String.valueOf(testCovidModel.getID()));
        hoTen.setText(testCovidModel.getHoTen());
        setDataChiTiet();
    }
}
