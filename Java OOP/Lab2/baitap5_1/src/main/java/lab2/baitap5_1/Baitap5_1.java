
package lab2.baitap5_1;

import java.util.Scanner;

public class Baitap5_1 {
    
    private static final String[] str_num = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int num = sc.nextInt();
        if (num > 0 || num < 10) {
            System.out.println("1 -> " + str_num[num - 1]);
        }
        else {
            System.out.println("Can't convert");
        }
    }
}
