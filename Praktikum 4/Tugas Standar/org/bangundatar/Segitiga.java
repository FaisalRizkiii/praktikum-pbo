/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Segitiga.java
    Deskripsi   : File Class dari Segitiga
*/
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
