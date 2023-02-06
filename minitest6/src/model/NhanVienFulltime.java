package model;

import model.NhanVien;

public class NhanVienFulltime extends NhanVien {
    private double tienthuong = 0;
    private double tienphat = 0;
    private double luongcung = 0;
    public NhanVienFulltime() {
    }
    public NhanVienFulltime(String mnv, String hoten, int tuoi, int sdt, String email, double tienthuong, double tienphat, double luongcung) {
        super(mnv, hoten, tuoi, sdt, email);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }
    public double luongFulltime() {
        return this.luongcung + (this.tienthuong - this.tienphat);
    }

    @Override
    public String toString() {
        return "Nhân viên Fulltime: " +
                "Mã nhân viên: " + getMnv() +
                "Họ tên: " + getHoten() +
                "Tuổi: " + getTuoi() +
                "SĐT: " + getSdt() +
                "Email: " + getEmail() +
                "Tiền thưởng: " + tienthuong +
                "Tiền phạt: " + tienphat +
                "Lương cứng: " + luongcung + "\n";
    }
}
