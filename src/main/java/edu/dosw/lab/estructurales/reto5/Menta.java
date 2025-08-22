package edu.dosw.lab.estructurales.reto5;

import edu.dosw.lab.estructurales.reto5.Cafe;

public class Menta implements ToppingDecorator{
    public int precio=1300;
    public Menta(Cafe cafe) {
            cafe.addPrecio(obtenerPrecio());
        }
    public int obtenerPrecio() {
        return precio;
    }
}
