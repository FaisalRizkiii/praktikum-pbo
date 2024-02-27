/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Garis.java
    Deskripsi   : File body main class dari program Garis
*/

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal = awal;
    }

    public void setTitikAKhir(Titik akhir){
        titikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getPanjang(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        return ordinat / absis;
    }

    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAKhirRefleksi = titikAkhir.getRefleksiY();

        return new Garis(titikAwalRefleksi, titikAKhirRefleksi);
    }

    public boolean isTegakLurus(Garis G){
        return getGradien() * G.getGradien() == -1;
    }
}
