package com.mycompany.calculator;

class Balok extends Nilai {
    private final int panjang;
    private final int lebar;
    private final int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double Volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double LuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }
}
