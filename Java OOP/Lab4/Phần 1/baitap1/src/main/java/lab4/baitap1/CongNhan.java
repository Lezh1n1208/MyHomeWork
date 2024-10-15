package lab4.baitap1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public int getTuoi() {
        return tuoi;
    }

    @Override
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    @Override
    public String toString() {
        return "CongNhan{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", bac=" + bac + '}';
    }
    
}