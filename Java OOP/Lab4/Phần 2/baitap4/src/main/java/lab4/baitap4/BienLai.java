package lab4.baitap4;

import java.util.Scanner;

public class BienLai extends KhachHang {

    private int chiSoCu;
    private int chiSoMoi;
    private int soTienPhaiTra;

    public void nhapThongTinBienLai() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin(); // Nhập thông tin từ lớp KhachHang
        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu = sc.nextInt();
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi = sc.nextInt();
        tinhTienDien(); // Tính tiền điện ngay sau khi nhập chỉ số
    }

    public void tinhTienDien() {
        soTienPhaiTra = (chiSoMoi - chiSoCu) * 1500;
    }

    public void hienThiBienLai() {
        super.hienThiThongTin(); // Hiển thị thông tin từ lớp KhachHang
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Số tiền phải trả: " + soTienPhaiTra + " VND");
    }
}
