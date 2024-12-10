package TTSach;

public class Sach {
    private String id;
    private String title;
    private String author;
    private String type;
    private String datesb;
    private String trangthai;

    public Sach(String id, String title, String author, String type, String datesb, String trangthai) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.datesb = datesb;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDatesb() {
        return datesb;
    }

    public void setDatesb(String datesb) {
        this.datesb = datesb;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "ID='" + id + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Type='" + type + '\'' +
                ", Publication Date='" + datesb + '\'' +
                ", Status=" + trangthai +
                '}';
    }
}
