package lab1.baitap2;

import java.util.Scanner;


public class Baitap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        Double dai = sc.nextDouble();
        System.out.print("Nhập chiều rộng:");
        Double rong = sc.nextDouble();
        System.out.println("Chu vi hình chữ nhật: " + (dai + rong)*2);
        System.out.println("Diện tích hình chữ nhật: " + dai*rong);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(dai, rong));
    }
}
