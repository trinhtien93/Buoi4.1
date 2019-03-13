import com.t3h.hinhhoc.HinhChuNhat;
import com.t3h.hinhhoc.HinhTron;

public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron("Tron,", 5);
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inThongTin();


        System.out.println("===============");

        HinhChuNhat hcn = new HinhChuNhat(" ChuNhat", 6f, 4f);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inThongTin();
    }
}
