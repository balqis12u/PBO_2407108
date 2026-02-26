package latihan_pbo.latihan3_2407108;

public class Coba {

    protected double panjang;
    protected double lebar;
    protected double sisi;

    // methods
    // setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void cetakLuas() {
        System.out.println("Luasnya adalah : " + (panjang * lebar));
    }

    public double hitungLuas() {
        double luas = panjang * lebar;
        return luas;
    }
}