package com.t3h.hinhhoc;

public class HinhTron extends HinhHoc{
    private float bankinh;

    public HinhTron(String tenhinh, float bankinh) {
        super(tenhinh);
        this.bankinh = bankinh;
    }

    @Override
    public void tinhChuVi() {
        double chuvi = 6.28 * bankinh;
        System.out.println(" Chuvi" + chuvi);

    }

    @Override
    public void tinhDienTich() {
        double dientich =3.14 *bankinh *bankinh;
        System.out.println("DienTich" +dientich);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(" Bankinh" +bankinh);
    }
}
