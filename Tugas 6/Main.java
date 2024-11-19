package Pertemuan6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("\n=== Program Perulangan ===");
            System.out.println("1. Menghitung Deret Bilangan Prima dan Bukan Prima");
            System.out.println("2. Menghitung Deret Bilangan Ganjil dan Genap");
            System.out.println("3. Menampilkan Huruf Z ke A");
            System.out.println("4. Lagu \"Anak Ayam Turun N\"");
            System.out.println("0. Keluar");
            System.out.print("Pilih program (0-4): ");
            pilihan = input.nextInt();

            // Memproses pilihan
            switch (pilihan) {
                case 1:
                    // Menjalankan program bilangan prima
                    BilanganPrima.main(new String[0]);
                    break;
                case 2:
                    // Menjalankan program bilangan ganjil dan genap
                    GanjilGenap.main(new String[0]);
                    break;
                case 3:
                    // Menjalankan program huruf Z - A
                    Urutan.main(new String[0]);
                    break;
                case 4:
                    // Menjalankan program lagu anak ayam
                    Lagu.main(new String[0]);
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih ulang.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
