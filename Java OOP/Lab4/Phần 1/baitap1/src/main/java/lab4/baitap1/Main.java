package lab4.baitap1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLiCanBo = new QuanLyCanBo();
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ");
            System.out.println("Nhấn 1: Thêm cán bộ");
            System.out.println("Nhấn 2: Tìm kiếm theo họ tên: ");
            System.out.println("Nhấn 3: Hiện thị thông tin về danh sách các cán bộ");
            System.out.println("Nhấn 4: Thoát khỏi chương trình");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhấn a: Thêm kĩ sư");
                    System.out.println("Nhấn b: Thêm công nhân");
                    System.out.println("Nhấn c: Thêm nhân viên");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhập tên: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhập tuổi:");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhập ngành đào tạo: ");
                            String nganhDaoTao = scanner.nextLine();
                            CanBo kiSu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            quanLiCanBo.themCanBo(kiSu);
                            System.out.println(kiSu.toString());
                            break;
                        }
                        case "b": {
                            System.out.print("Nhập tên: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhập tuổi:");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhập bậc: ");
                            int bac = scanner.nextInt();
                            CanBo kiSu = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                            quanLiCanBo.themCanBo(kiSu);
                            System.out.println(kiSu.toString());
                            break;
                        }
                        case "c": {
                            System.out.print("Nhập tên: ");
                            String hoTen = scanner.nextLine();
                            System.out.print("Nhập tuổi:");
                            int tuoi = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String diaChi = scanner.nextLine();
                            System.out.print("Nhập công việc: ");
                            String congViec = scanner.nextLine();
                            CanBo kiSu = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                            quanLiCanBo.themCanBo(kiSu);
                            System.out.println(kiSu.toString());
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhập tên cần tìm: ");
                    String name = scanner.nextLine();
                    quanLiCanBo.timKiem(name).forEach(officer -> {
                        System.out.println(officer.toString());

                    });
                    break;
                }
                case "3": {
                    quanLiCanBo.printList();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
