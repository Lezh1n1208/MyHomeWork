
package lab2.baitap5_2;

import java.util.Scanner;

public class Baitap5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();
        
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("a, b, c là 3 cạnh của tam giác");
        }
        else {
            System.out.println("a, b, c không phải là 3 cạnh của tam giác");
        }
        
    }
}
