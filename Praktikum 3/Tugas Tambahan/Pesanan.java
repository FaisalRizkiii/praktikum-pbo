/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : Pesanan.java
    Deskripsi   : File class dari program Pesanan
*/
public class Pesanan {
    private Menu menu;
    private int jumlah;
    private double total;


    public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
        hitungTotal();
    }


    public Menu getMenu() {
        return menu;
    }


    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    public int getJumlah() {
        return jumlah;
    }


    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    private void hitungTotal() {
        total = menu.getHarga() * jumlah;
    }
}

