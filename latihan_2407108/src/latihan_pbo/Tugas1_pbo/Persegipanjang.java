package latihan_pbo.Tugas1_pbo;

public class Persegipanjang {
    double panjang;
    double lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}
