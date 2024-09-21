
package lab2.baitap5_3;

import java.util.Scanner;

public class Baitap5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        
        if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
            System.out.println("a, b, c là 3 cạnh của tam giác vuông");
        }
        else {
            System.out.println("a, b, c không phải 3 cạnh của tam giác vuông");
        }
    }
}
