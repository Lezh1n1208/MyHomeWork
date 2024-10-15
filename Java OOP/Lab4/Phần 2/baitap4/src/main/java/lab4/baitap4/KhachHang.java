package lab4.baitap4;

import java.util.Scanner;

public class KhachHang {

    protected String hoTenChuHo;
    protected String soNha;
    protected String maSoCongTo;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTenChuHo = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha = sc.nextLine();
        System.out.print("Nhập mã số công tơ: ");
        maSoCongTo = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }

}
