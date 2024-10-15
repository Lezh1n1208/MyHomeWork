package lab4.baitap4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> danhSachBienLai = new ArrayList<>();

        System.out.print("Nhập số lượng hộ sử dụng điện: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho hộ thứ " + (i + 1) + ":");
            BienLai bl = new BienLai();
            bl.nhapThongTinBienLai();
            danhSachBienLai.add(bl);
        }

        System.out.println("\nDanh sách biên lai của các hộ sử dụng điện:");
        for (BienLai bl : danhSachBienLai) {
            bl.hienThiBienLai();
            System.out.println();
        }
    }
}
