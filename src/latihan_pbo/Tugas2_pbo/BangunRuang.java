package latihan_pbo.Tugas2_pbo;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar * 2;
    }

    // method hitung volume
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitungVolume2() {
        return hitungLuas() * tinggi;
    }

    public void tampilkaninfoRuang() {
        super.tampilHasil();
        System.out.println("tinggi :" + tinggi);
    }
}