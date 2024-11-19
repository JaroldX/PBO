package Pertemuan5;

import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Hitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        String kategori;

        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else {
            kategori = "Gemuk (Obesitas)";
        }

        // Output
        System.out.println("\nHasil:");
        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kategori);
    }
}
