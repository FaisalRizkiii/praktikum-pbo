/*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : Lingkaran.java
 * Deskripsi : File class lingkaran yang memiliki interface IArea
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
