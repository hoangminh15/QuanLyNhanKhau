package controllers.covidControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import models.KhaiBaoSucKhoeModel;
import models.TestCovidModel;
import services.CovidService;

import java.net.URL;
import java.util.ResourceBundle;

public class KhaiBaoSucKhoeController implements Initializable {
    @FXML
    Label ID;
    @FXML
    Label hoTen;
    @FXML
    TextArea trieuChung;
    @FXML
    TextArea nguoiTiepXuc;
    @FXML
    TextArea tieuSuBenh;

    CovidService covidService;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        covidService = new CovidService();
    }

    public void xacNhan(ActionEvent event){
        if (!isMissingField()){
            KhaiBaoSucKhoeModel khaiBaoSucKhoeModel = new KhaiBaoSucKhoeModel();
            khaiBaoSucKhoeModel.setID(Integer.parseInt(ID.getText()));
            khaiBaoSucKhoeModel.setHoTen(hoTen.getText());
            khaiBaoSucKhoeModel.setTrieuChung(trieuChung.getText());
            khaiBaoSucKhoeModel.setNguoiTiepXuc(nguoiTiepXuc.getText());
            khaiBaoSucKhoeModel.setTieuSuBenh(tieuSuBenh.getText());
            try{
                covidService.themThongTinSucKhoe(khaiBaoSucKhoeModel);
            } catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Người này đã được thêm thông tin sức khỏe");
            }

            Alert themThanhCongAlert = new Alert(Alert.AlertType.INFORMATION);
            themThanhCongAlert.setTitle("");
            themThanhCongAlert.setContentText("Thêm thông tin sức khỏe thành công");
            themThanhCongAlert.show();
        }
        huy(event);
    }

    public boolean isMissingField(){
        if (trieuChung.getText().equals("") || nguoiTiepXuc.getText().equals("") || tieuSuBenh.getText().equals("") || trieuChung.getText().isBlank()){
            return true;
        } else return false;
    }

    public void huy(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
    }

    public void setData(TestCovidModel testCovidModel) {
        ID.setText(String.valueOf(testCovidModel.getID()));
        hoTen.setText(testCovidModel.getHoTen());
    }
}
