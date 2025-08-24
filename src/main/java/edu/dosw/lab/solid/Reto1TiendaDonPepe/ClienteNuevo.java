package edu.dosw.lab.solid.Reto1TiendaDonPepe;

import edu.dosw.lab.solid.Reto1TiendaDonPepe.Cliente;

public class ClienteNuevo extends Cliente {

    public ClienteNuevo(String nombre) {
        super("Nuevo");
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        return totalCompra * 0.05;}


}