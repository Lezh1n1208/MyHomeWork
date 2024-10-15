package phan2bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

    public void nhapThongTinThiSinh() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số báo danh: ");
        int soBaoDanh = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        System.out.print("Nhập ưu tiên: ");
        int uuTien = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập khối thi (A, B, C): ");
        String khoiThi = scanner.nextLine();

        ThiSinh thiSinh = new ThiSinh(soBaoDanh, hoTen, diaChi, uuTien, khoiThi);
        danhSachThiSinh.add(thiSinh);
    }

    public void hienThiThongTin(int soBaoDanh) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh() == soBaoDanh) {
                ts.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh với số báo danh: " + soBaoDanh);
    }

    public void timKiemTheoSoBaoDanh(int soBaoDanh) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh() == soBaoDanh) {
                ts.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh.");
    }

    public void timKiemTheoKhoiThi(String khoiThi) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getKhoiThi().equalsIgnoreCase(khoiThi)) {
                ts.hienThiThongTin();
            }
        }
    }

    public void sapXepTangDanTheoSoBaoDanh() {
        Collections.sort(danhSachThiSinh, Comparator.comparingInt(ThiSinh::getSoBaoDanh));
        System.out.println("Danh sách đã được sắp xếp theo số báo danh.");
    }

    public void tongSoThiSinhTheoKhoi(String khoiThi) {
        int count = 0;
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getKhoiThi().equalsIgnoreCase(khoiThi)) {
                count++;
            }
        }
        System.out.println("Tổng số thí sinh khối " + khoiThi + ": " + count);
    }
}
