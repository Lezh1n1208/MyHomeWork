
package lab2.baitap1;

import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất có dạng: ax + b = 0");
        System.out.print("Nhập a: ");
        Double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        Double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            Double x = -b/a;
            System.out.println("Phuong trình có nghiệm duy nhất: " + x);
        }                
    }
}
