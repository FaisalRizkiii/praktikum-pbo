/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Titik.java
    Deskripsi   : File Body main class dari program Garis
*/

public class Titik {
    private double absis;
    private double ordinat;
    static double counterTitik;

    Titik(){
        absis = 0;
        ordinat= 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }
    
    public void setAbsis(double a){
        absis = a;
    }
    
    public double getAbsis(){
        return absis;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getOrdinat(){
        return ordinat;
    }
    
    public static double getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}

