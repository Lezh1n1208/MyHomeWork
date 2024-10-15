package phan2bai2;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;

    public Nguoi(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString(){
        return "Họ tên: " + hoTen + "\nTuổi: " + tuoi + "\nNăm sinh: " + namSinh + "\nNghề nghiệp: " + ngheNghiep;
    }

}
