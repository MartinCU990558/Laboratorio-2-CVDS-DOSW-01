package edu.dosw.lab.comportamiento.reto1;

public class FrecuenteClienteDescuento implements DescuentoStrategy {
    public double aplicarDescuento(double monto) {
        return monto * 0.10;
    }
}
