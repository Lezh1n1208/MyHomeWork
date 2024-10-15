package lab4.baitap3;

import java.util.Scanner;

public class Nguoi {

    protected String hoTen;
    protected int tuoi;
    protected int namSinh;
    protected String queQuan;

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();  // Clear buffer
        System.out.print("Nhập quê quán: ");
        queQuan = sc.nextLine();
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Quê quán: " + queQuan);
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

}
