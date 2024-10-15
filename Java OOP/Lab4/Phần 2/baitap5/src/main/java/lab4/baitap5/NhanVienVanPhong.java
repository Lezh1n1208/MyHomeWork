package lab4.baitap5;

public class NhanVienVanPhong extends NhanVien {

    private double luongCoBan;
    private double heSoLuong;

    public NhanVienVanPhong(String maNV, String hoTen, String ngaySinh, String ngayVaoLam, boolean coConNho, double luongCoBan, double heSoLuong) {
        super(maNV, hoTen, ngaySinh, ngayVaoLam, coConNho);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
}
