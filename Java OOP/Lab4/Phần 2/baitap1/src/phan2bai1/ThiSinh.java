package phan2bai1;

public class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int uuTien;
    private String khoiThi;

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, int uuTien, String khoiThi) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
        this.khoiThi = khoiThi;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getUuTien() {
        return uuTien;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void hienThiThongTin() {
        System.out.println("Số báo danh: " + soBaoDanh);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ưu tiên: " + uuTien);
        System.out.println("Khối thi: " + khoiThi);
    }
}
