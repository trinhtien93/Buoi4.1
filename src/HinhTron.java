public class HinhTron extends Hinh {
    private String tenHinh;
    private String butVe;

    public HinhTron( String tenHinh,String butve) {
        super(butve);
        this.tenHinh = tenHinh;
        this.butVe = butve;
    }


    @Override
    public void ve() {
        System.out.println(tenHinh + "duoc ve bang " + butVe);

    }

}
