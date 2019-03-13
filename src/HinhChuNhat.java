public class HinhChuNhat extends Hinh {

    private String tenHinh;
    private String butve;

    public HinhChuNhat( String tenHinh ,String butve) {
        super(butve);
        this.tenHinh = tenHinh;
        this.butve = butve;
    }

    @Override
    public void ve() {
        System.out.println(tenHinh + " duoc ve bang " + butve);

    }


}
