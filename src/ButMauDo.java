public class ButMauDo extends ButVe {
    private String mauDo;

    public ButMauDo(String mauBut) {
        super(mauBut);
        this.mauDo = mauBut;
    }

    @Override
    public void ve() {
        System.out.println("mauDo");

    }

    public void inThongTin() {
        System.out.println(" mauDo" + mauDo);
    }
}


