package com.mycompany.calculator;

public class Main {
    public static void main(String[] args) {
        Balok balok = new Balok(10, 6, 4);
        Kubus kubus = new Kubus(8);

        System.out.println("Balok:");
        System.out.println("Volume: " + balok.Volume());
        System.out.println("Luas Permukaan: " + balok.LuasPermukaan());

        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.Volume());
        System.out.println("Luas Permukaan: " + kubus.LuasPermukaan());
    }
}
