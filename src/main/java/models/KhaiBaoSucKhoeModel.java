package models;

public class KhaiBaoSucKhoeModel {
    private int ID;
    private String hoTen;
    private String trieuChung;
    private String nguoiTiepXuc;
    private String tieuSuBenh;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getNguoiTiepXuc() {
        return nguoiTiepXuc;
    }

    public void setNguoiTiepXuc(String nguoiTiepXuc) {
        this.nguoiTiepXuc = nguoiTiepXuc;
    }

    public String getTieuSuBenh() {
        return tieuSuBenh;
    }

    public void setTieuSuBenh(String tieuSuBenh) {
        this.tieuSuBenh = tieuSuBenh;
    }
}
