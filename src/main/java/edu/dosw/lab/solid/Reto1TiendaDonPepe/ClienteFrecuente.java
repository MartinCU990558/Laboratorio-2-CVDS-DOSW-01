package edu.dosw.lab.solid.Reto1TiendaDonPepe;

public class ClienteFrecuente extends Cliente {


    public ClienteFrecuente(String nombre) {
        super("Frecuente");
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        return totalCompra * 0.1;
    }
}