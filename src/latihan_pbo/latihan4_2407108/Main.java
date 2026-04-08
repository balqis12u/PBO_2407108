package latihan_pbo.latihan4_2407108;

public class Main {

    public static void main(String[] args) {

        SegiTiga sTiga = new SegiTiga();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegiTiga());

        JajarGenjang jj = new JajarGenjang();

        jj.setAlas(4);
        jj.setTinggi(5);
        System.out.println("Luas Jajar Genjang adalah : " + jj.LuasJajarGenjang());
    }

}