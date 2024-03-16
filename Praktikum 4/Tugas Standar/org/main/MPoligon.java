/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : MPoligon.java
    Deskripsi   : File class Main
*/
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
    
        Segitiga segitiga = new Segitiga(3, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitga : " + segitiga.hitungLuas());
    }
}
