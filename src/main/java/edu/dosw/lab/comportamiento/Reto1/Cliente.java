package edu.dosw.lab.comportamiento.Reto1;

class Cliente {
    private final String nombre;
    private final Descuento estrategiaDescuento;

    public Cliente(String nombre, Descuento estrategiaDescuento) {
        this.nombre = nombre;
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return estrategiaDescuento.getTipoCliente();
    }

    public double calcularDescuento(double subtotal) {
        return estrategiaDescuento.aplicar(subtotal);
    }
}