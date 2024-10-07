package lab3.baitap2nc;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String mssv;
    private double nnltc;
    private double lthdt;
    private double anm;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String mssv, double nnltc, double lthdt, double anm) {
        this.hoTen = hoTen;
        this.mssv = mssv;
        this.nnltc = nnltc;
        this.lthdt = lthdt;
        this.anm = anm;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public double getNnltc() {
        return nnltc;
    }

    public void setNnltc(double nnltc) {
        this.nnltc = nnltc;
    }

    public double getLthdt() {
        return lthdt;
    }

    public void setLthdt(double lthdt) {
        this.lthdt = lthdt;
    }

    public double getAnm() {
        return anm;
    }

    public void setAnm(double anm) {
        this.anm = anm;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", mssv=" + mssv + ", nnltc=" + nnltc + ", lthdt=" + lthdt + ", anm=" + anm + '}';
    }
    
    public double diemTB() {
        return (nnltc + lthdt + anm)/3;
    }
    
    public String xepLoai() {
        double x = diemTB();
        if (x >= 9) {
            return "Giỏi";
        }
        else if (x >= 8) {
            return "Khá";
        }
        else if (x >= 6) {
            return "Trung bình";
        }
        return "Không đạt";
    }
    
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập MSSV: ");
        this.setMssv(sc.nextLine());
        System.out.print("Nhập điểm ngôn ngữ lập trình C++: ");
        this.setNnltc(sc.nextDouble());        
        System.out.print("Nhập điểm LTHĐT: ");
        this.setLthdt(sc.nextDouble());        
        System.out.print("Nhập điểm an ninh mạng: ");
        this.setAnm(sc.nextDouble());       
    }
    
    public void printInfo() {
        System.out.println("Tên sinh viên: " + hoTen);
        System.out.println("MSSV: " + mssv);
        System.out.println("Điểm NNLTC++: " + nnltc);
        System.out.println("Điểm LTHĐT: " + lthdt);
        System.out.println("Điểm ANM: " + anm);
        System.out.println("Điểm TB: " + diemTB());
        System.out.println("Xếp loại: " + xepLoai());
    }
}