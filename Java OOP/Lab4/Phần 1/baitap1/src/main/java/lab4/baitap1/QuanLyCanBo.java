package lab4.baitap1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {
    List<CanBo> listCanbo;
    
    public QuanLyCanBo() {
        listCanbo = new ArrayList<>();
    }
    
    public void themCanBo(CanBo canBo) {
        listCanbo.add(canBo);
    }
    
    public List<CanBo> timKiem(String hoTen) {
        return listCanbo.stream().filter(o -> o.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }
    
    public void printList() {
        listCanbo.forEach(o -> System.out.println(o.toString()));
    }
}