package controllers.nhanKhauControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import services.HoKhauService;
import services.MysqlConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class KhaiTuController implements Initializable {

    @FXML
    ImageView checkedIcon;
    @FXML
    ImageView checkedIcon1;
    @FXML
    TextField soCMTnguoiChet;
    @FXML
    TextField soCMTnguoiKhai;
    @FXML
    TextField soGiayKhaiTu;
    @FXML
    DatePicker ngayKhai;
    @FXML
    DatePicker ngayMat;
    @FXML
    TextArea lyDoChet;
    @FXML
    Button checkButton;
    @FXML
    Button check1Button;
    @FXML
    Button xacNhanButton;
    @FXML
    Button huyButton;


    boolean isValid, isValid1;
    int idNguoiChet;
    HoKhauService hoKhauService;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hoKhauService = new HoKhauService();
        checkedIcon.setVisible(false);
        checkedIcon1.setVisible(false);
        soGiayKhaiTu.setDisable(true);
        ngayKhai.setDisable(true);
        ngayMat.setDisable(true);
        lyDoChet.setDisable(true);
    }

    public void check(ActionEvent event){
        String tempCMT;
        if(event.getSource().equals(checkButton)){
            tempCMT = soCMTnguoiChet.getText().trim();
        } else {
            tempCMT = soCMTnguoiKhai.getText().trim();
        }
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
        int tempID = checkCMT(tempCMT);
        if (tempID != -1){
            if(event.getSource().equals(checkButton)){
                isValid = true;
            } else {
                isValid1 = true;
            }
            if(isValid && isValid1) {
                soCMTnguoiKhai.setEditable(false);
                soCMTnguoiChet.setEditable(false);
                checkedIcon.setVisible(true);
                checkedIcon1.setVisible(true);
                soGiayKhaiTu.setDisable(false);
                ngayKhai.setDisable(false);
                ngayMat.setDisable(false);
                lyDoChet.setDisable(false);
                xacNhanButton.setDisable(false);
                huyButton.setDisable(false);

                idNguoiChet = checkCMT(soCMTnguoiChet.getText());
            }
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Không tìm thấy số CMT trong hệ thống");
            alert.show();
        }
    }

    public void xacNhan(ActionEvent event){
        hoKhauService.khaiTu(idNguoiChet);
        huy(event);
    }

    public void huy(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
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

}
