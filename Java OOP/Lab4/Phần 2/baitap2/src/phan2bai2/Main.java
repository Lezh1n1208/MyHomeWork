/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phan2bai2;

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
        KhuPho khuPho = new KhuPho();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng hộ dân trong khu phố: ");
        int soHoDan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Nhập thông tin cho hộ dân thứ " + (i + 1) + ":");
            khuPho.nhapThongTinHoDan();
        }

        System.out.println("Thông tin các hộ trong khu phố:");
        System.out.println(khuPho.toString());
    }
    
}
