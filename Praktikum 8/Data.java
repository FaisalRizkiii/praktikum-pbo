/*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : Data.java
 * Deskripsi : File class dari Data
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
public class Data<T> {
    private T isi;
    
    public T getIsi(){
        return this.isi;
    }
    
    void setIsi(T x){
        this.isi = x;
    }
}
