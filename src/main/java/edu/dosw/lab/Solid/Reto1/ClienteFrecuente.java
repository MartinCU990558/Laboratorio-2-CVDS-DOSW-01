package edu.dosw.lab.Solid.Reto1;

public class ClienteFrecuente implements Cliente {
    private final String nombre;
    private final Descuentos descuento;

    public ClienteFrecuente(String nombre) {
        this.nombre = nombre;
        this.descuento = new DescuentoFe();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularDescuento(double subtotal) {
        return descuento.aplicarDescuento(subtotal);
    }
}

