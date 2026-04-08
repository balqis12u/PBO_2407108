package latihan_pbo.Tugas1_pbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== PROGRAM BANGUN DATAR ===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Jajar Genjang");
        System.out.print("Pilih bangun datar: ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                Persegipanjang pp = new Persegipanjang(panjang, lebar);

                System.out.println("Rumus = panjang x lebar");
                System.out.println("Luas = " + pp.hitungLuas());
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                Segitiga s = new Segitiga();
                s.setAlas(alas);
                s.setTinggi(tinggi);

                System.out.println("Rumus = 1/2 x alas x tinggi");
                System.out.println("Luas = " + s.LuasSegiTiga());
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                JajarGenjang jg = new JajarGenjang();
                jg.setAlas(a);
                jg.setTinggi(t);

                System.out.println("Rumus = alas x tinggi");
                System.out.println("Luas = " + jg.LuasJajarGenjang());
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}