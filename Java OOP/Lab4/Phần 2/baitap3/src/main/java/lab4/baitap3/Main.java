package lab4.baitap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HSHocSinh> danhSachHocSinh = new ArrayList<>();

        System.out.print("Nhập số lượng học sinh: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1) + ":");
            HSHocSinh hs = new HSHocSinh();
            hs.nhapThongTin();
            danhSachHocSinh.add(hs);
        }

        System.out.println("Danh sách học sinh sinh năm 2000:");
        for (HSHocSinh hs : danhSachHocSinh) {
            if (hs.getNamSinh() == 2000) {
                hs.hienThiThongTin();
            }
        }
        
        int count = 0;
        for (HSHocSinh hs : danhSachHocSinh) {
            if (hs.getNamSinh() == 2000 && hs.getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
                count++;
            }
        }
        System.out.println("Số lượng học sinh sinh năm 2000 và quê ở Thái Nguyên: " + count);
    }
}
