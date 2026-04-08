class Cafe {
    String nama;
    String alamat;

    // constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Cafenya adalah = " + nama);
        System.out.println("Alamatnya di = " + alamat);
    }

    // method
    void buka() {
        System.out.println("Cafe Sudah Buka");
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Halaman", "Indramayu");
        cafe1.buka();

        Cafe cafe2 = new Cafe("Teringat", "Indramayu");
        cafe2.buka();

        Cafe cafe3 = new Cafe("KopKen", "Indramayu");
        cafe3.buka();
    }
}