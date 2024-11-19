package Pertemuan5;

import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian (Rp): ");
        double totalPembelian = input.nextDouble();
        double potongan, jumlahBayar;

        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.2 * totalPembelian;
        }

        jumlahBayar = totalPembelian - potongan;

        // Output
        System.out.println("\nOutput:");
        System.out.println("Total pembelian: Rp " + totalPembelian);
        System.out.println("Besarnya potongan: Rp " + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp " + jumlahBayar);
    }
}

