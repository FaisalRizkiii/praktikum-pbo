/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Asersi2.java
    Deskripsi   : File body main class dari program Asersi2
*/

import static java.lang.Math.PI;

class Lingkaran {
    private double jejari;

    public Lingkaran (double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        double keliling = 2 * PI * jejari;
        return keliling;
    }

}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"Jari jari tidak boleh nol";
        Lingkaran L = new Lingkaran(jariJari);
        double kelilingLingkaran = L.hitungKeliling();
        System.out.println("Keliling lingkaran : " + kelilingLingkaran);
    }
}

// Pada code ini terdapat kesalahan pada penempatan asersinya,
// seharusnya ditempatkan dibawah pembuatan lingkaran supaya akan lebih valid hasilnya jika saat 