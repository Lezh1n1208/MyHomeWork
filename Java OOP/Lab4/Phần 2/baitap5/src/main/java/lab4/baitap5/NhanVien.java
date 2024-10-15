package lab4.baitap5;

public abstract class NhanVien {

    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String ngayVaoLam;
    private boolean coConNho;

    public NhanVien(String maNV, String hoTen, String ngaySinh, String ngayVaoLam, boolean coConNho) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.coConNho = coConNho;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public boolean isCoConNho() {
        return coConNho;
    }

    public abstract double tinhLuong();

    public double getTroCap() {
        return isCoConNho() ? tinhLuong() * 0.05 : 0;
    }

    public void hienThiThongTin() {
        System.out.printf("Mã NV: %s | Họ tên: %s | Ngày sinh: %s | Ngày vào làm: %s | Lương: %.1f\n",
                maNV, hoTen, ngaySinh, ngayVaoLam, tinhLuong() + getTroCap());
    }
}