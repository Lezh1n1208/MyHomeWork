
package lab2.baitap2;

import java.util.Scanner;

public class Baitap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 có dạng ax^2 + bx + c = 0");
        System.out.print("Nhập a: ");
        Double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        Double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        Double c = sc.nextDouble();
        Double delta = Math.pow(b, 2) - 4*a*c;
        
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta == 0) {
            Double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        }
        else {
            Double x1 = (-b + Math.sqrt(delta))/(2*a);
            Double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
