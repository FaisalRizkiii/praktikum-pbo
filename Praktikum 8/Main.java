/*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : Main.java
 * Deskripsi : File Maini dari proyek Kupu
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGenerikB;

/**
 *
 * @author faisa
 */
public class Main {
    public static void main(String[] args){
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
    
        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
