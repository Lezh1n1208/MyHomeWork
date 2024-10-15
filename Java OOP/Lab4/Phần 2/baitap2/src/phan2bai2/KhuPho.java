package phan2bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan;

    public KhuPho() {
        danhSachHoDan = new ArrayList<>();
    }

    public void nhapThongTinHoDan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nhà: ");
        String soNha = scanner.nextLine();

        System.out.print("Nhập số thành viên trong hộ: ");
        int soThanhVien = scanner.nextInt();
        scanner.nextLine();

        HoDan hoDan = new HoDan(soThanhVien, soNha);

        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhập thông tin cho thành viên thứ " + (i + 1) + ":");

            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();

            System.out.print("Năm sinh: ");
            int namSinh = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nghề nghiệp: ");
            String ngheNghiep = scanner.nextLine();

            Nguoi nguoi = new Nguoi(hoTen, tuoi, namSinh, ngheNghiep);
            hoDan.themThanhVien(nguoi);
        }

        danhSachHoDan.add(hoDan);
    }
    @Override
    public String toString() {
        String result = "";
        for (HoDan hoDan : danhSachHoDan) {
            result += hoDan + "\n";
        }
        return result;
    }

}
