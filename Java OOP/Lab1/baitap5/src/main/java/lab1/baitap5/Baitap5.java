
package lab1.baitap5;

import java.util.Scanner;

public class Baitap5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm cần kiểm tra: ");
        long nam = sc.nextLong();
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.println("Năm " + nam + " nhuận");
        }
        else {
            System.out.println("Năm " + nam + " không phải năm nhuận");
        }
    }
}
