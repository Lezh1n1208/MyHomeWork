package lab1.baitap1;

import java.util.Scanner;


public class Baitap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Điểm trung bình: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
    }
}
