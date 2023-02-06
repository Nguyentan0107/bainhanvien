package model;

import model.NhanVien;

public class NhanVienParttime extends NhanVien {
    private double sogiolamviec = 0;
    public NhanVienParttime(){}

    public NhanVienParttime(String mnv, String hoten, int tuoi, int sdt, String email, double sogiolamviec) {
        super(mnv, hoten, tuoi, sdt, email);
        this.sogiolamviec = sogiolamviec;
    }

    public double getSogiolamviec() {
        return sogiolamviec;
    }

    public void setSogiolamviec(double sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }
    public double luongParttime (){
        return this.sogiolamviec * 100000;
    }

    @Override
    public String toString() {
        return "Nhân viên Parttime: " +
                "Mã nhân viên: " + getMnv() +
                "Họ tên: " + getHoten() +
                "Tuổi: " + getTuoi() +
                "SĐT: " + getSdt() +
                "Email: " + getEmail() +
                "Số giờ làm việc: " + sogiolamviec + "\n";
    }
}
