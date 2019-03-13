public abstract class Hinh {
    protected String butve;

    public Hinh(String butve) {
        this.butve = butve;
    }

    public abstract void ve();

    public void inThongTin() {
        System.out.println(" Butve" + butve);
    }

}

