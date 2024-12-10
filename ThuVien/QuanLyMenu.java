package ThuVien;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import TTSach.*;
import QuanLySach.ThuVien;
import java.lang.Exception.*;

public class QuanLyMenu {
    private ThuVien thuVien;
    private List<ThuVien> thuVienList;
    private Sach sach;
    private Scanner sc;

    public QuanLyMenu(ThuVien thuVien, Sach sach, Scanner sc) {
        this.thuVien = thuVien;
        this.sach = sach;
        this.sc = sc;
    }
    public QuanLyMenu(ThuVien thuVien, Scanner sc) {
        this.thuVien = thuVien;
        this.sc = sc;
    }
    public void hienthiMenu() {
        int choice = -1;
        do {
            System.out.println("==MENU QUAN LY THU VIEN==");
            System.out.println("1. Them sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Hien thi sach");
            System.out.println("5. Thong tin thu vien");
            System.out.println("6. Thoat");

            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Nhap lua chon: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        menuthemsach();
                        break;
                    case 2:
                        menuxoasach();
                        break;
                    case 3:
                        menutimkiemsach();
                        break;
                    case 4:
                        menuhienthisach();
                        break;
                    case 5:
                        menuxuatttthuvien();
                        break;
                    case 6:
                        System.out.println("Tam biet");
                        break;
                    default:
                        System.out.println("Khong hop le");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lua chon khong hop le1");
                sc.nextLine();
            }
        } while(choice != 6);
    }

    //Menu Them sach
    public void menuthemsach() {
        System.out.println("Them id sach: ");
        String id = sc.nextLine();
        System.out.println("Them tieu de sach: ");
        String title = sc.nextLine();
        System.out.println("Them ten tac gia: ");
        String author = sc.nextLine();
        System.out.println("Them the loai sach: ");
        String type = sc.nextLine();
        System.out.println("Them nam xuat ban: ");
        String namxb = sc.nextLine();
        System.out.println("Trang thai sach: ");
        String tranthai = sc.nextLine();
        System.out.println("Sach da duoc them!");
        Sach sach1 = new Sach(id, title, author, type, namxb, tranthai);
        thuVien.themsachmoi(sach1);
    }

    //Menu xoa sach
    public void menuxoasach() {
        System.out.println("Nhap id sach ban muon xoa: ");
        String id = sc.nextLine();
        if(thuVien.xoasach(id)) {
            System.out.println("Sach da duoc xoa.");
        }
        else {
            System.out.println("Khong co sach co id: " + id);
        }
    }

    //Menu tim kiem sach
    public void menutimkiemsach() {
        System.out.println("Nhap tieu de sach hoac ten tac gia cua sac ma ban muon tim kiem: ");
        String name = sc.nextLine();
        Sach sach2 = thuVien.timkiemsach(name);
        if(sach2 != null) {
            System.out.println(sach2);
        }
        else {
            System.out.println("Khong co sach voi ten tac gia(tieu de) " + name + " trong thu vien");
        }
    }

    //Menu hien thi sach
    public void menuhienthisach() {
        thuVien.hienthisach();
    }

    //Menu xuat thong tin thu vien
    public void menuxuatttthuvien() {
        System.out.println(thuVien.toString());
    }
}
