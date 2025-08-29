package edu.dosw.lab.solid.reto1;

public class ClienteFrecuente implements Descuento {
    @Override
    public int aplicarDescuento(int precio) {
        return (int) (precio * 0.1);
    }
}
