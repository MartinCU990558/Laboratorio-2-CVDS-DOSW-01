package edu.dosw.lab.comportamiento.reto1;

public class NuevoClienteDescuento implements DescuentoStrategy {
    public double aplicarDescuento(double monto) {
        return monto * 0.05;
    }
}
