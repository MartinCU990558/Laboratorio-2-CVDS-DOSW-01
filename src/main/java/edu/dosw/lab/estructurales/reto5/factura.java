package edu.dosw.lab.estructurales.reto5;

public class factura {
    private int total;
    public factura(Cafe cafe){
        this.total=cafe.getPrecio();
    }
    public void addCafe(Cafe cafe){
        this.total=+cafe.getPrecio();
    }

    public int getTotal() {
        return total;
    }
}
