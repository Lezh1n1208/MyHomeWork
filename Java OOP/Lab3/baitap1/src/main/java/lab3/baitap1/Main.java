/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab3.baitap1;

import java.util.Scanner;

/**
 *
 * @author Lezh1n
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        System.out.print("Nhập mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên sinh viên 1: ");
        sv1.setTenSV(sc.nextLine());
        System.out.print("Nhập điểm lý thuyết: ");
        sv1.setDiemLT(sc.nextFloat());
        System.out.print("Nhập điểm thực hành: ");
        sv1.setDiemTH(sc.nextFloat());
        sv1.inSV();
        System.out.println(sv1);
    }
}
