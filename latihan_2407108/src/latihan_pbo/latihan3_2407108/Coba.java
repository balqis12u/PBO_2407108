package latihan_pbo.latihan3_2407108;

public class Coba {

    protected double panjang;
    protected double lebar;
    protected double sisi;

    // ===== PERSEGI PANJANG =====
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void cetakLuasPersegiPanjang() {
        System.out.println("Luas Persegi Panjang adalah : " + (panjang * lebar));
    }

    public double hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    // ===== PERSEGI =====
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void cetakLuasPersegi() {
        System.out.println("Luas Persegi adalah : " + (sisi * sisi));
    }

    public double hitungLuasPersegi() {
        return sisi * sisi;
    }
}