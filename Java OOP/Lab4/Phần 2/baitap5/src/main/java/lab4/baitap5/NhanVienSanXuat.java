package lab4.baitap5;

public class NhanVienSanXuat extends NhanVien {

    private int soSanPham;
    private double donGia;

    public NhanVienSanXuat(String maNV, String hoTen, String ngaySinh, String ngayVaoLam, boolean coConNho, int soSanPham, double donGia) {
        super(maNV, hoTen, ngaySinh, ngayVaoLam, coConNho);
        this.soSanPham = soSanPham;
        this.donGia = donGia;
    }

    @Override
    public double tinhLuong() {
        return soSanPham * donGia;
    }
}