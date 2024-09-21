
package lab2.baitap4;

import java.util.Scanner;

public class Baitap4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kí tự: ");
        char c = sc.next().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Kí tự vừa tập là nguyên âm");
        }
        else {
            System.out.println("Kí tự vừa nhập là phụ âm");
        }
        
    }
}
