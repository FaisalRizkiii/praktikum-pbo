/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author faisa
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata (String bunyi){
        this.bunyi = bunyi;   
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
       System.out.println(getBunyi());
       this.peluru = this.peluru - 1;
       System.out.println("Sisa peluru: " + getPeluru());
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }  
}
