package Pertemuan7;

import java.util.Scanner;

public class Toserba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data barang berdasarkan kode
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 2000, 5000};

        // Meminta jumlah item
        System.out.print("Masukkan jumlah item barang: ");
        int jumlahItem = input.nextInt();

        // Inisialisasi array untuk input pengguna
        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];
        int totalBayar = 0;

        // Input data barang
        System.out.println("\n---------------------------------------------------");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan kode barang: ");
            kodeInput[i] = input.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = input.nextInt();

            // Menentukan harga dan menghitung jumlah bayar
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equalsIgnoreCase(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar[i];
                }
            }
        }

        // Output data barang
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("TOKO SERBA ADA");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15s %-10s %-10s %-10s\n", "No", "Kode", "Nama Barang", "Harga", "Jumlah", "Total");
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equalsIgnoreCase(kodeBarang[j])) {
                    System.out.printf("%-5d %-10s %-15s %-10d %-10d %-10d\n",
                            (i + 1), kodeInput[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                }
            }
        }

        // Output total bayar
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Total Bayar: " + totalBayar);
    }
}

