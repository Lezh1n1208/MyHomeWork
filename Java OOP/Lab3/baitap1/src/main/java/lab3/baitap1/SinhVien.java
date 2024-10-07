package lab3.baitap1;

import java.util.Locale;

public class SinhVien {

    private int maSV;
    private String tenSV;
    private Float diemLT;
    private Float diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, Float diemLT, Float diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(Float diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(Float diemTH) {
        this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        return maSV + "-" + tenSV + " điểm trung bình: " + tinhdiemTB();
    }
    
    public Float tinhdiemTB() {
        return (this.diemLT + this.diemTH)/2;
    }
    
    public void inSV() {
        Locale locale = new Locale("vi", "VN");
        System.out.printf(locale, "%6d %-18s %12.2f %12.2f %12.2f \n", maSV, tenSV, diemLT, diemTH, tinhdiemTB());
    }
    
}