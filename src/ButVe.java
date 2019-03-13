public abstract class ButVe {
    protected String mauBut;

    public ButVe(String mauBut) {
        this.mauBut = mauBut;
    }
    public abstract void ve();

    public void inThongTin(){
        System.out.println("mauBut " +mauBut);
    }

}
