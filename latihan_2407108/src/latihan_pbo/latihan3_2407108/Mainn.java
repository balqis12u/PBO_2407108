package latihan_pbo.latihan3_2407108;

public class Mainn {

    public static void main(String[] args) {

        Coba pp1 = new Coba();

        // ===== PERSEGI PANJANG =====
        pp1.setPanjang(9);
        pp1.setLebar(10);

        System.out.println("Panjangnya adalah : " + pp1.getPanjang());
        pp1.cetakLuasPersegiPanjang();

        // ===== PERSEGI =====
        pp1.setSisi(5);
        pp1.cetakLuasPersegi();
    }
}