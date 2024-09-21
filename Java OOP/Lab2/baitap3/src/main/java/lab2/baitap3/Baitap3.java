
package lab2.baitap3;

import java.util.Scanner;

public class Baitap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        int soDien = sc.nextInt();
        if (soDien < 50) {
            System.out.println("Tiền điện là: " + (soDien*1000));
        }
        else {
            System.out.println("Tiền điện là: " + (50*1000 + (soDien - 50)*1200));
        }
    }
}
