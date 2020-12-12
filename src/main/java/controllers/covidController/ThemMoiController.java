package controllers.covidController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.TestCovidModel;
import services.CovidService;
import services.MysqlConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ThemMoiController implements Initializable {
    @FXML
    TextField soCMTText;
    @FXML
    ImageView checkedIcon;
    @FXML
    Label hoTenLB;
    @FXML
    DatePicker thoiGianTestDP;
    @FXML
    TextField ketQuaTestText;
    @FXML
    TextField hinhThucTestText;
    @FXML
    Button xacNhanButton;
    @FXML
    Button huyButton;

    TestCovidModel testCovidModel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        testCovidModel = new TestCovidModel();
        setUpForCheck();
    }

    public void check(ActionEvent event){
        String tempCMT = soCMTText.getText().trim();
        if (tempCMT.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setContentText("Vui lòng nhập số CMT");
            alert.show();
            return;
        } else {
            try {
                Long.parseLong(tempCMT);
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning!");
                alert.setContentText("Vui lòng nhập số CMT đúng định dạng");
                alert.show();
                return;
            }
        }
        int tempID = checkCMT(soCMTText.getText());
        String tempName = checkCMTgetName(soCMTText.getText());
        if (tempID != -1){
            soCMTText.setEditable(false);
            checkedIcon.setVisible(true);
            thoiGianTestDP.setDisable(false);
            ketQuaTestText.setDisable(false);
            hinhThucTestText.setDisable(false);
            xacNhanButton.setDisable(false);
            huyButton.setDisable(false);
            hoTenLB.setText(tempName);

            testCovidModel.setID(tempID);
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Không tìm thấy số CMT trong hệ thống");
            alert.show();
        }
    }

    public int checkCMT(String cmt) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cmt);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            Alert errorMessage = new Alert(Alert.AlertType.ERROR);
            errorMessage.setTitle("Warning!");
            errorMessage.setContentText("Có lỗi xảy ra! vui lòng kiểm tra lại.");
            errorMessage.show();
        }
        return -1;
    }

    public String checkCMTgetName(String cmt){
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cmt);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getString("hoTen");
            }
        } catch (Exception e) {
            Alert errorMessage = new Alert(Alert.AlertType.ERROR);
            errorMessage.setTitle("Warning!");
            errorMessage.setContentText("Có lỗi xảy ra! vui lòng kiểm tra lại.");
            errorMessage.show();
        }
        return null;
    }

    public void xacNhan(ActionEvent event){
        if(!validateForm()){
            Alert errorMessage = new Alert(Alert.AlertType.ERROR);
            errorMessage.setTitle("Warning!");
            errorMessage.setContentText("Vui lòng nhập hết các trường bắt buộc!");
            errorMessage.show();
        } else {
            testCovidModel.setHoTen(hoTenLB.getText());
            testCovidModel.setThoiGianTest(String.valueOf(thoiGianTestDP.getValue()));
            testCovidModel.setKetQuaTest(ketQuaTestText.getText().trim());
            testCovidModel.setHinhThucTest(hinhThucTestText.getText().trim());
            if(new CovidService().addNew(testCovidModel)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Thêm thành công");
                alert.show();
                soCMTText.setText("");
                hoTenLB.setText("");
                thoiGianTestDP.setValue(null);
                ketQuaTestText.setText("");
                hinhThucTestText.setText("");
                setUpForCheck();
            }

        }
    }

    public void huy(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
    }

    public void setUpForCheck(){
        checkedIcon.setVisible(false);
        thoiGianTestDP.setDisable(true);
        ketQuaTestText.setDisable(true);
        hinhThucTestText.setDisable(true);
        xacNhanButton.setDisable(true);
        huyButton.setDisable(true);
        hoTenLB.setText("");
    }

    private boolean validateForm() {
        return !(thoiGianTestDP.getValue().equals("")
                || ketQuaTestText.getText().trim().isEmpty()
                || hinhThucTestText.getText().trim().isEmpty());
    }

}
