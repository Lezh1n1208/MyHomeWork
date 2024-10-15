package lab4.baitap2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {

            System.out.println("Chương trình quản lý tài liệu");
            System.out.println("Nhấn 1: Thêm tài liệu");
            System.out.println("Nhấn 2: Tìm kiếm theo thể loại: ");
            System.out.println("Nhấn 3: Hiển thị thông tin tài liệu");
            System.out.println("Nhấn 4: Xoá tài liệu theo id");
            System.out.println("Nhấn 5: Thoát:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhấn a: Thêm sách");
                    System.out.println("Nhấn b: Thêm báo");
                    System.out.println("Nhấn c: Thêm tạp chí");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhập số bản: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhập tác giả: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Nhập số trang: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author,
                                    pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhập số bản: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhập ngày phát hành: ");
                            int dayIssue = scanner.nextInt();

                            Document newspaper = new Newspaper(id, nxb, number,
                                    dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhập nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhập số bản: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhập số phát hành: ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Nhập tháng phát hành: ");
                            int issueMonth = scanner.nextInt();
                            Document journal = new Journal(id, nxb, number, issueNumber,
                                    issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Nhập a để tìm sách");
                    System.out.println("Nhập b để tìm báo");
                    System.out.println("Nhập c để tìm tạp chí");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }

                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Nhập ID cần xoá: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id)
                            ? "Thành công" : "Thất bại");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
