package com.t3h.hinhhoc;

public class HinhChuNhat extends HinhHoc {
    private float Chieudai;
    private float Chieurong;

    public HinhChuNhat(String tenhinh, float chieudai, float chieurong) {
        super(tenhinh);
        Chieudai = chieudai;
        Chieurong = chieurong;
    }

    @Override
    public void tinhDienTich() {
        double dientich =Chieudai *Chieurong;
        System.out.println(" Dien tich la :" +dientich);

    }

    @Override
    public void tinhChuVi() {
        double chuvi =(Chieudai + Chieurong)*2;
        System.out.println(" chuvi la: " +chuvi);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Chieudai " + Chieudai);
        System.out.println("Chieurong" +Chieurong);
    }
}
