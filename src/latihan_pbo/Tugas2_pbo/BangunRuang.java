package latihan_pbo.Tugas2_pbo;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}