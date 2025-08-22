package edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE;
import edu.dosw.lab.solid.Reto_1_TIENDA_DON_PEPE.Cliente;

public class Cliente_Frecuente extends Cliente {


    public Cliente_Frecuente(String nombre) {
        super("Frecuente");
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        return totalCompra * 0.1;
    }
}