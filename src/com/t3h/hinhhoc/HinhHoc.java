package com.t3h.hinhhoc;

public abstract class HinhHoc {
    protected String tenhinh;

    public HinhHoc(String tenhinh) {
        this.tenhinh = tenhinh;
    }
    public abstract void tinhChuVi();

    public  abstract void  tinhDienTich();

    public void inThongTin(){
        System.out.println(" Hinh" +tenhinh);
    }
}
