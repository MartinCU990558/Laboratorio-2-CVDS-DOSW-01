package edu.dosw.lab.comportamiento;

public class DescuentoNuevo implements  Descuento{
    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.05;
    }

    @Override
    public String getTipoCliente() {
        return "Nuevo";
    }
}
