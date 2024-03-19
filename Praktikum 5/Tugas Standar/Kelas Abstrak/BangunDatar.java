/*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : BangunDatar.java
 * Deskripsi : File class abstrak dari Bangun Datar
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);
    
    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }

}