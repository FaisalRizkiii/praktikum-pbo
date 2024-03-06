/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : AngkaSial.java
    Deskripsi   : File body main class dari program AngkaSial
*/

public class AngkaSial {
    
    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(12);
            as.cobaAngka(13);
            
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println(("Hati-hati memasukkan angka!"));
        }
    }
}
