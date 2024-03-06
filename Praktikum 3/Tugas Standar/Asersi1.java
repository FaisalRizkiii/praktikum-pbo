/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Asersi1.java
    Deskripsi   : File body main class dari program Asersi1
*/

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("Nilai x " + x);
        }else{
            assert (x < 0): "ada kesalahan dalam kode";
            System.out.println("x bilangan negatif");
        }
    }
}