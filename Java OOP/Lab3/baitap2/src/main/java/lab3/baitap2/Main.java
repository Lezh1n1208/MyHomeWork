/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lab3.baitap2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date nSX = sdf.parse("12-08-2024");
            Date hSD = sdf.parse("12-08-2025");
            ThucPham tp = new ThucPham("tp1", "Sữa bò", 20000000, nSX, hSD);
            
            tp.kiemTraNgay();
            tp.kiemTraTenHang();
            tp.kiemTraHSD();
            tp.toString();
        } catch (ParseException e) {
            
        }

    }
}
