package latihan_pbo.Tugas2_pbo;

public class BangunDatar {
    // atribut (encapsulation: private)
    protected double panjang;
    protected double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    public void tampilHasil() {
        System.out.println("panjang :" + panjang);
        System.out.println("lebar :" + lebar);
    }
}