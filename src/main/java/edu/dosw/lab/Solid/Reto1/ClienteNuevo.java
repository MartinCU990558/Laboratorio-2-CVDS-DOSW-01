package edu.dosw.lab.Solid.Reto1;
public class ClienteNuevo implements Cliente {
    private final String nombre;
    private final Descuentos descuento;

    public ClienteNuevo(String nombre) {
        this.nombre = nombre;
        this.descuento = new DescuentoNu();
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
