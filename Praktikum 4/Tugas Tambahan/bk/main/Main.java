/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : bukuFiksi.java
    Deskripsi   : File Main dari proyek buku
*/
package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuNaruto = new bukuNovel("Naruto", "Satoshi", "2022", "anime", 200, 100000);
        bukuNaruto.view();
        bukuAkademik caraCoding = new bukuAkademik("Dasar Coding", "Mahmed", "2010", "Coding", 559, 50000);
        caraCoding.view();
    }
}