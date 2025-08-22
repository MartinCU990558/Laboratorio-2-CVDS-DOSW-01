package edu.dosw.lab.estructurales.reto5;

import edu.dosw.lab.estructurales.reto5.Cafe;

public class CremaBatida implements ToppingDecorator{
    public int precio=2000;
    public CremaBatida(Cafe cafe) {
        cafe.addPrecio(obtenerPrecio());
    }
    public int obtenerPrecio() {
        return precio;
    }
}