public class Main1 {
    public static void main(String[] args) {
        ButMauXanh bmx = new ButMauXanh("mauXanh");
        bmx.ve();
        ButMauDo bmd = new ButMauDo("mauDo");
        bmd.ve();
        System.out.println("===========");

        HinhChuNhat hcn = new HinhChuNhat("HinhChuNhat", "MauXanh");
        hcn.ve();
        HinhTamGiac htg = new HinhTamGiac("HinhTamGiac", "MauDo");
        htg.ve();
        HinhTron ht = new HinhTron("HinhTron ", "MauXanh");
        ht.ve();

    }

}
