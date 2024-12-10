package QuanLySach;

import TTSach.Sach;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ThuVien implements Quanlysach {
    private String tvid; //Ma thu vien
    private String tvname; //Ten thu vien
    private List<Sach> danhsach; //Danh sach sach trong thu vien

    public ThuVien(String tvid, String tvname, List<Sach> danhsach) {
        this.tvid = tvid;
        this.tvname = tvname;
        this.danhsach = new ArrayList<>();
    }

    public String getTvid() {
        return tvid;
    }

    public void setTvid(String tvid) {
        this.tvid = tvid;
    }

    public String getTvname() {
        return tvname;
    }

    public void setTvname(String tvname) {
        this.tvname = tvname;
    }

    public List<Sach> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(List<Sach> danhsach) {
        this.danhsach = danhsach;
    }

    //Them sach moi
    @Override
    public void themsachmoi(Sach sach) {
        danhsach.add(sach);
    }

    //Xoa sach dua tren id
    @Override
    public boolean xoasach(String id) {
        return danhsach.removeIf(sach -> sach.getId().equals(id));
    }

    //Tim kiem sach dua vao tieu de or tac gia
    @Override
    public Sach timkiemsach(String id) {
        for(Sach sach : danhsach) {
            if(sach.getTitle().equals(id) || sach.getAuthor().equals(id)) {
                System.out.println(sach);
                return sach;
            }
        }
        return null;
    }

    //Hien thi sach
    public void hienthisach() {
        for(Sach sach : danhsach) {
            System.out.println(sach);
        }
    }

    //Sap xep danh sach theo ten
    //Nguon tham khao cua em https://stackoverflow.com/questions/8432581/how-to-sort-a-listobject-alphabetically-using-object-name-field
    public void sapxepdanhsach() {
        if(danhsach.size() > 0) { //Kiem tra kich thuo cua danh sach. Neu kich thuoc = 0 thi khong sap xep
            Collections.sort(danhsach, new Comparator<Sach>() { // Sap xep danh sach
                @Override
                public int compare(final Sach o1, final Sach o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
        }
    }

    //toString
    @Override
    public String toString() {
        return "Thu vien: ID[" + tvid + "], Ten thu vien[" + tvname + "], Tong sach[" + danhsach.size() + "]";
    }
}
