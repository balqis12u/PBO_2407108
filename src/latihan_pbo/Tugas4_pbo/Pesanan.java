package latihan_pbo.Tugas4_pbo;

public class Pesanan {
    private MenuItem item;
    private int jumlah;

    // Constructor
    public Pesanan(MenuItem item, int jumlah) {
        this.item = item;
        this.jumlah = jumlah;
    }

    // Getter jumlah
    public int getJumlah() {
        return jumlah;
    }

    // Getter item
    public MenuItem getItem() {
        return item;
    }

    // Method hitung total
    public double hitungTotal() {
        return item.getHarga() * jumlah;
    }

    // Tampilkan pesanan
    public void tampilkan() {
        System.out.println("Nama Menu  : " + item.getNama());
        System.out.println("Harga      : " + item.getHarga());
        System.out.println("Jumlah     : " + jumlah);
        System.out.println("Total      : " + hitungTotal());
        System.out.println("------------------------");
    }
}