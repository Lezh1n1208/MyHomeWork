package lab4.baitap3;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {

    private String lop;
    private String khoaHoc;
    private String kyHoc;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập khoá học: ");
        khoaHoc = sc.nextLine();
        System.out.print("Nhập kỳ học: ");
        kyHoc = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lớp: " + lop);
        System.out.println("Khóa học: " + khoaHoc);
        System.out.println("Kỳ học: " + kyHoc);
    }
}
