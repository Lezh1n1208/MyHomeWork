package lab3.baitap2nc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DSSinhVien {

    private List<SinhVien> listSV;

    public DSSinhVien() {
        listSV = new ArrayList<>();
    }

    public DSSinhVien(List<SinhVien> listSV) {
        this.listSV = listSV;
    }
    
    
    
    public void add(SinhVien sv) {
        listSV.add(sv);
    }
    
    public void remove(SinhVien sv) {
        listSV.remove(sv);
    }
    
    public void printSV() {
        for (SinhVien sv : listSV) {
            sv.printInfo();
        }
    }
    
    public int soSVGioi() {
        int res = 0;
        for (SinhVien sv : listSV) {
            if (sv.xepLoai().equals("Giỏi")) {
                res++;
            }
        }
        return res;
    }
    
    public int soSVKha() {
        int res = 0;
        for (SinhVien sv : listSV) {
            if (sv.xepLoai().equals("Khá")) {
                res++;
            }
        }
        return res;
    }
    
    public int soSVTrungBinh() {
        int res = 0;
        for (SinhVien sv : listSV) {
            if (sv.xepLoai().equals("Trung Bình")) {
                res++;
            }
        }
        return res;
    }
    
    public int soSVKhongDat() {
        int res = 0;
        for (SinhVien sv : listSV) {
            if (sv.xepLoai().equals("Không đạt")) {
                res++;
            }
        }
        return res;
    }
    
    public static void sortByName(List<SinhVien> list) {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv2.getMssv().compareTo(sv2.getMssv());
            }
        });
    }
    
    public void sapXepTangDan() {
        sortByName(listSV);
        for (SinhVien sv : listSV) {
            sv.printInfo();
        }
    }
    
    public SinhVien searchByHoTen(String hoTen) {
        for (SinhVien sv : listSV) {
            if (sv.getHoTen().equals(hoTen)) {
                return sv;
            }
        }
        return null;
    }
    
    public int sinhVienCoDiemLonHon(double d) {
        int res = 0;
        for (SinhVien sv : listSV) {
            if (sv.diemTB() >= d) {
                res++;
            }
        }
        return res;
    }
    
    public List<SinhVien> sinhVienCoDiemTBCaoNhat() {
        double max = 0;
        SinhVien sinhvien = null;
        for (SinhVien sv : listSV) {
            if (sv.diemTB() > max) {
                max = sv.diemTB();
                sinhvien = sv;
            }
        }
        List<SinhVien> res = new ArrayList<>();
        for (SinhVien sv : listSV) {
            if (sv.diemTB() == sinhvien.diemTB()) {
                res.add(sv);
            }
        }
        return res;
    }
}