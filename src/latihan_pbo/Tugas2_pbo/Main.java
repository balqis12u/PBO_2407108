package latihan_pbo.Tugas2_pbo;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangun = new BangunRuang(10, 5, 4);

        // output
        System.out.println("Luas = " + bangun.hitungLuas());
        System.out.println("Volume = " + bangun.hitungVolume());
        System.out.println("Child = " + bangun.hitungVolume());
    }
}