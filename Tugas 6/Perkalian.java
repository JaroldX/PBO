package Pertemuan6;

import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (1-10): ");
        int n = input.nextInt();

        if (n >= 1 && n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((i * j) + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus antara 1 dan 10!");
        }
    }
}

