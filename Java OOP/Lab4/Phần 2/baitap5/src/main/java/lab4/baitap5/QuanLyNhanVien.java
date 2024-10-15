package lab4.baitap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien {

    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int soNV = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soNV; i++) {
            System.out.println("Nhập thông tin cho nhân viên " + (i + 1));
            System.out.print("Loại NV (1: Văn phòng, 2: Sản xuất): ");
            int loaiNV = sc.nextInt();
            sc.nextLine();
            System.out.print("Mã NV: ");
            String maNV = sc.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            String ngaySinh = sc.nextLine();
            System.out.print("Ngày vào làm (dd/MM/yyyy): ");
            String ngayVaoLam = sc.nextLine();
            System.out.print("Có con dưới 3 tuổi? (true/false): ");
            boolean coConNho = sc.nextBoolean();

            if (loaiNV == 1) {
                System.out.print("Lương cơ bản: ");
                double luongCoBan = sc.nextDouble();
                System.out.print("Hệ số lương: ");
                double heSoLuong = sc.nextDouble();
                danhSachNhanVien.add(new NhanVienVanPhong(maNV, hoTen, ngaySinh, ngayVaoLam, coConNho, luongCoBan, heSoLuong));
            } else if (loaiNV == 2) {
                System.out.print("Số sản phẩm: ");
                int soSanPham = sc.nextInt();
                System.out.print("Đơn giá: ");
                double donGia = sc.nextDouble();
                danhSachNhanVien.add(new NhanVienSanXuat(maNV, hoTen, ngaySinh, ngayVaoLam, coConNho, soSanPham, donGia));
            }
            sc.nextLine();
        }
    }

    public void hienThiNhanVien() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }
}
