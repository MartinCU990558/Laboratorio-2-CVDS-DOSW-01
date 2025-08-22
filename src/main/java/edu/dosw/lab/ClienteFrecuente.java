package edu.dosw.lab;

public class ClienteFrecuente extends Cliente{
    private double descuento = 0.1; 

    public ClienteFrecuente(String tipo,CarritoDeCompras carrito, double descuento){
            super(tipo, carrito);
            this.descuento = descuento;
    }

    public double getDescuento(){
        return descuento;
    }

    @Override
    public double calcularDescuento(){
        return carrito.total()*descuento;
    }
}