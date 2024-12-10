
import java.util.ArrayList;
import QuanLySach.*;
import ThuVien.QuanLyMenu;
import TTSach.Sach;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tao thu vien moi
        ThuVien thuVien1 = new ThuVien("24CNTT", "Thanh Hoa", new ArrayList<>(10));

        //Them sach
        Sach sach1 = new Sach("HK145", "Dac nhan tam", "Dale Carnegie", "Self help", "15/10/2022", "San sang");
        Sach sach2 = new Sach("JC569", "Mat Biec", "Nguyen Nhat Anh", "Truyen tinh cam", "14/5/2021", "San sang");
        Sach sach3 = new Sach("KI157", "Trang Quynh", "Kim Khanh", "Truyen ke van hoc dan gian", "15/6/2020", "Dang muon");
        Sach sach4 = new Sach("FG874", "Cay Cam Ngot Cua Toi", "Jose Mauro De Vasconcelos", "Tieu Thuyet", "22/8/2022", "San sang");
        Sach sach5 = new Sach("CK587", "Quang ganh lo di", "Dale Carnegie", "Self help", "15/11/2021", "San sang");

        thuVien1.themsachmoi(sach1);
        thuVien1.themsachmoi(sach2);
        thuVien1.themsachmoi(sach3);
        thuVien1.themsachmoi(sach4);
        thuVien1.themsachmoi(sach5);

        thuVien1.sapxepdanhsach();//Sap xep danh sach theo ten

        //Hien thi menu quan ly sach
        Scanner sc = new Scanner(System.in);
        QuanLyMenu quanLyMenu = new QuanLyMenu(thuVien1, sc);
        quanLyMenu.hienthiMenu();
    }
}