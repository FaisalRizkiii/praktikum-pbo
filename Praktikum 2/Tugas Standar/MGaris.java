/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : MGaris.java
    Deskripsi   : Main class dari program Garis
*/

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1,2);
        Titik t2 = new Titik(4,5);

        Garis G1 = new Garis(t1,t2);
        Titik titikAwal = G1.getTitikAwal();
        Titik titikAkhir = G1.getTitikAkhir();

        System.out.println("Titik Awal G1 :(" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir G1 :(" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");


        System.out.println("Panjang Garis G1 :" + G1.getPanjang());

        System.out.println("Gradien Garis G1 :" + G1.getGradien());

        Garis G1RefleksiY = G1.getRefleksiY();
        Titik titikAwalRefleksiY = G1RefleksiY.getTitikAwal();
        Titik titikAkhirRefleksiY = G1RefleksiY.getTitikAkhir();

        System.out.println("Titik Awal: (" + titikAwalRefleksiY.getAbsis() + "," +  titikAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhirRefleksiY.getAbsis() + "," +  titikAkhirRefleksiY.getOrdinat() + ")");

        System.out.println("Garis G1 Tegak lurus dengan garis G1RefleksiY = " + G1.isTegakLurus(G1RefleksiY));

    }
}
