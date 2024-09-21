
package lab1.baitap3;

import java.util.Scanner;


public class Baitap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của hình lập phương: ");
        Double canh = sc.nextDouble();
        System.out.println("Thể tích hình lập phương: " + Math.pow(canh, 3));
    }
}
