package model;

public class NhanVien {
    private String mnv ;
    private String hoten ;
    private int tuoi ;
    private int sdt ;
    private String email ;
    public NhanVien(){
    }

public NhanVien (String mnv, String hoten, int tuoi, int sdt, String email) {
    this.mnv = mnv;
    this.hoten = hoten;
    this.tuoi = tuoi;
    this.sdt = sdt;
    this.email = email;
}

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "Mã nhân viên: " + mnv +
                "Họ Tên: " + hoten + '\'' +
                "Tuổi: " + tuoi +
                "Số điện thoại: " + sdt + '\'' +
                "Email: " + email + '\'' +  '}';
    }
}
