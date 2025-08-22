package edu.dosw.lab.estructurales.reto5;

public class Leche implements ToppingDecorator{

    public int precio=1000;
    
    public Leche(Cafe cafe) {
        cafe.addPrecio(obtenerPrecio());
    }
    public int obtenerPrecio() {
        return precio;
    }
}