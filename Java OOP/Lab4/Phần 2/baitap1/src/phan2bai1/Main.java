/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phan2bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhập thông tin thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh theo số báo danh");
            System.out.println("3. Tìm kiếm thí sinh theo số báo danh");
            System.out.println("4. Tìm kiếm thí sinh theo khối thi");
            System.out.println("5. Sắp xếp thí sinh theo số báo danh");
            System.out.println("6. Tổng số thí sinh theo khối");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tuyenSinh.nhapThongTinThiSinh();
                    break;
                case 2:
                    System.out.print("Nhập số báo danh: ");
                    int soBaoDanh = scanner.nextInt();
                    tuyenSinh.hienThiThongTin(soBaoDanh);
                    break;
                case 3:
                    System.out.print("Nhập số báo danh: ");
                    soBaoDanh = scanner.nextInt();
                    tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanh);
                    break;
                case 4:
                    System.out.print("Nhập khối thi: ");
                    String khoiThi = scanner.next();
                    tuyenSinh.timKiemTheoKhoiThi(khoiThi);
                    break;
                case 5:
                    tuyenSinh.sapXepTangDanTheoSoBaoDanh();
                    break;
                case 6:
                    System.out.print("Nhập khối thi: ");
                    khoiThi = scanner.next();
                    tuyenSinh.tongSoThiSinhTheoKhoi(khoiThi);
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    
}
