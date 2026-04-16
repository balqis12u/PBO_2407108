package latihan_pbo.Tugas4_pbo;

public class Main {
    public static void main(String[] args) {

        // Buat menu
        MenuItem m1 = new MenuItem("Nasi Goreng", 15000);
        MenuItem m2 = new MenuItem("Mie Ayam", 12000);

        // Buat pesanan
        Pesanan p1 = new Pesanan(m1, 2);
        Pesanan p2 = new Pesanan(m2, 3);

        // Tampilkan
        p1.tampilkan();
        p2.tampilkan();

        // Total semua
        double total = p1.hitungTotal() + p2.hitungTotal();
        System.out.println("TOTAL SEMUA: " + total);
    }
}