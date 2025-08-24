package edu.dosw.lab.solid.Reto1;

public class Cliente {
    private TipoCliente tipo;
    CarritoDeCompras carrito;

    public Cliente(TipoCliente tipo, CarritoDeCompras carrito) {
        this.tipo = tipo;
        this.carrito = carrito;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}
