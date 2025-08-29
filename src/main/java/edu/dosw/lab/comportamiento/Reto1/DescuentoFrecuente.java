package edu.dosw.lab.comportamiento;

public class DescuentoFrecuente implements Descuento{
    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.10;
    }

    @Override
    public String getTipoCliente() {
        return "Frecuente";
    }
}
