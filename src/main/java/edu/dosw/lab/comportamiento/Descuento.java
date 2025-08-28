package edu.dosw.lab.comportamiento;

public interface Descuento {
    double aplicar(double subtotal);
    String getTipoCliente();
}
