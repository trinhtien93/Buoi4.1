public class ButMauXanh extends ButVe {
    private String mauXanh;

    public ButMauXanh(String mauBut) {
        super(mauBut);
        this.mauXanh = mauBut;
    }

    @Override
    public void ve() {
        System.out.println("mau xanh");

    }

    public void inThongTin() {
        System.out.println("Mauxanh " + mauXanh);
    }
}


