package services;

import models.TestCovidModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CovidService {

    public List<TestCovidModel> getListTestCovid(){
        List<TestCovidModel> list = new ArrayList<>();
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM testcovid";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                TestCovidModel testCovidModel = new TestCovidModel();
                testCovidModel.setID(rs.getInt("ID"));
                testCovidModel.setHoTen(rs.getString("hoTen"));
                testCovidModel.setThoiGianTest(rs.getString("thoiGianTest"));
                testCovidModel.setKetQuaTest(rs.getString("ketQuaTest"));
                testCovidModel.setHinhThucTest(rs.getString("hinhThucTest"));
                list.add(testCovidModel);
            }
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void addNew(TestCovidModel testCovidModel){
        int ID = testCovidModel.getID();
        String hoTen = testCovidModel.getHoTen();
        String thoiGianTest = testCovidModel.getThoiGianTest();
        String ketQuaTest = testCovidModel.getKetQuaTest();
        String hinhThucTest = testCovidModel.getHinhThucTest();
        try{
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO testcovid VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, ID);
            preparedStatement.setString(2, hoTen);
            preparedStatement.setString(3, thoiGianTest);
            preparedStatement.setString(4, ketQuaTest);
            preparedStatement.setString(5, hinhThucTest);
            preparedStatement.executeUpdate(query);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
