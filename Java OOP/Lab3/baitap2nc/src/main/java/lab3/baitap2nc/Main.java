/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab3.baitap2nc;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSSinhVien dsSinhVien = new DSSinhVien();
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        while (n > 0) {
            SinhVien sv = new SinhVien();
            sv.getInput();
            dsSinhVien.add(sv);
            n--;
        }
        sc.nextLine();
        System.out.println("Tổng số sinh viên xếp loại Giỏi: " +  dsSinhVien.soSVGioi());
        System.out.println("Tổng số sinh viên xếp loại Khá: " +  dsSinhVien.soSVKha());
        System.out.println("Tổng số sinh viên xếp loại Trung Bình: " +  dsSinhVien.soSVTrungBinh());
        System.out.println("Tổng số sinh viên xếp loại Không Đạt: " +  dsSinhVien.soSVKhongDat());
        dsSinhVien.sapXepTangDan();
        dsSinhVien.printSV();
        System.out.print("Nhập tên SV cần tìm: ");
        String name = sc.nextLine();
        SinhVien searchSV = dsSinhVien.searchByHoTen(name);
        searchSV.printInfo();
        System.out.print("Nhập điểm cần kiêm tra: ");
        double diem = sc.nextDouble();
        System.out.println("Số SV có điểm lớn hơn điểm vừa nhập: " + dsSinhVien.sinhVienCoDiemLonHon(diem));
        System.out.println("DS các sinh viên có điểm cao nhất:");
        List<SinhVien> diemCaoNhat = dsSinhVien.sinhVienCoDiemTBCaoNhat();
        for (SinhVien sv : diemCaoNhat) {
            sv.printInfo();
        }
        
    }
}
