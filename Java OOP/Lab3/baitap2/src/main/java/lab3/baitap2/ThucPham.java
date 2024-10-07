package lab3.baitap2;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ThucPham {

    private String maHang;
    private String tenHang;
    private float donGia;
    private Date nSX;
    private Date hSD;

    public ThucPham() {
    }

    public ThucPham(String maHang, String tenHang, float donGia, Date nSX, Date hSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Date getnSX() {
        return nSX;
    }

    public void setnSX(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }

    public Date gethSD() {
        return hSD;
    }

    public void sethSD(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hSD = calendar.getTime();
    }
    
    @Override
    public String toString() {
        Locale locate = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locate);
        String str = numberFormat.format(donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(nSX);
        String str2 = simpleDateFormat.format(hSD);
        return "Thông tin về thực phẩm: \nMã hàng: " + maHang + "\nTên hàng: " + tenHang + "\nĐơn giá: " + str + "\nNgày sản xuất: " + str1 + "\nHạn sử dụng: " + str2;
    }
    
    public void kiemTraNgay() {
        if (this.getnSX().compareTo(this.gethSD()) > 0) {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất");
        }
    }
    
    public void kiemTraTenHang() {
        if (this.tenHang.equals("") || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống");
        }
    }
    
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày: " + st + ", hàng đã hết hạn");
        }
        else {
            System.out.println("Hôm nay là ngày: " + st + ", hàng vẫn còn hạng");
        }
    }
}