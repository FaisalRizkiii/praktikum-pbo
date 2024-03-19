/*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : MLingkaran.java
 * Deskripsi : File main dari class Lingkaran
 */
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jejari lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l1 = new Lingkaran(jejari);
        
        System.out.println("Luas lingkaran dengan jejari" + jejari +" satuan adalah "+ l1.hitungLuas());

    }
}
