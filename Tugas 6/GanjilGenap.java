package Pertemuan6;

public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil (0 - 20):");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan Genap (0 - 20):");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

