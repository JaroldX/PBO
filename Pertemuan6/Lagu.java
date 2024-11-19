package Pertemuan6;

import java.util.Scanner;

public class Lagu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak ayam: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("Anak ayam turun 0, habis semua.");
    }
}

