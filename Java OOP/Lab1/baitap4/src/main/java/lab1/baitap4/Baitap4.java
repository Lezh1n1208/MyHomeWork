
package lab1.baitap4;

import java.util.Scanner;

public class Baitap4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình có dạng a*x^2 + b*x + c = 0");
        System.out.print("Nhâp hệ số a: ");
        Double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        Double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        Double c = sc.nextDouble();
        Double delta = Math.pow(b, 2) - 4*a*c;
        System.out.println("Delta = " + (delta));
        if (delta >= 0) {
            System.out.println("Delta = " + Math.sqrt(delta));
        }
        else {
            System.out.println("Delta < 0 nên không thể tính căn delta");
        }
    }
}
