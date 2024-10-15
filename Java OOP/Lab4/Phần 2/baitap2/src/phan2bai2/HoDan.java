package phan2bai2;

import java.util.ArrayList;

public class HoDan {
    private int soThanhVien;
    private String diaChi;
    private ArrayList<Nguoi> thanhVien;

    public HoDan(int soThanhVien,String diaChi){
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
        this.thanhVien = new ArrayList<>();
    }
    public void themThanhVien(Nguoi nguoi){
        if(thanhVien.size() < this.soThanhVien){
            thanhVien.add(nguoi);
        }
        else{
            System.out.println("Số thành viên trong hộ dân đã đạt tối a, không thể thêm được nữa");
        }
    }
    @Override
    public String toString(){
        String result = "Hộ dân có địa chỉ: " + this.diaChi + "\n";
        for(Nguoi nguoi : thanhVien){
            result += nguoi.toString() + "\n";
        }
        return result;
    }
}
