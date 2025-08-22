package edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE;

import edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE.Cliente;

public class Cliente_Nuevo extends Cliente {

    public Cliente_Nuevo(String nombre) {
        super("Nuevo");
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        return totalCompra * 0.05;}


}