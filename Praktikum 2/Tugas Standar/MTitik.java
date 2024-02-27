/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : MTitik.java
    Deskripsi   : Main class dari program Titik
*/

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(5,6);


        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")" );
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")" );
        System.out.println("t2(" + t3.getAbsis() + "," + t3.getOrdinat() + ")" );

        System.out.println("Jarak ke Pusat");
        System.out.println("Jarak Titik t1 ke pusat :" + t1.getJarakPusat());
        System.out.println("Jarak Titik t2 ke pusat :" + t2.getJarakPusat());
        System.out.println("Jarak Titik t3 ke pusat :" + t3.getJarakPusat());

        t1.refleksiX();
        t2.refleksiX();
        t3.refleksiX();
        
        System.out.println("Refleksi X");
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")" );
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")" );
        System.out.println("t2(" + t3.getAbsis() + "," + t3.getOrdinat() + ")" );

        t1.refleksiY();
        t2.refleksiY();
        t3.refleksiY();

        System.out.println("Refleksi Y");
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")" );
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")" );
        System.out.println("t2(" + t3.getAbsis() + "," + t3.getOrdinat() + ")" );

        System.out.println("Reflexsi X");
        Titik t1RefleksiX = t1.getRefleksiX();
        System.out.println("t1(" + t1RefleksiX.getAbsis() + "," + t1RefleksiX.getOrdinat() + ")" );

        System.out.println("Reflexsi Y");
        Titik t1RefleksiY = t1.getRefleksiY();
        System.out.println("t1(" + t1RefleksiY.getAbsis() + "," + t1RefleksiY.getOrdinat() + ")" );

    }
}

// Kesimpulan
// Jika suatu access modifier dibuat menjadi private maka class yang lain tidak dapat 
// mengakses class yang access modifiernya telah diubah menjadi private. 
// Karena access modifier private hanya classnya sendiri yang dapat mengakses nantinya.
