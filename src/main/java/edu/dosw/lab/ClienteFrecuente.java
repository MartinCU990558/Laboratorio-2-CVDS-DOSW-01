package edu.dosw.lab;

public class ClienteFrecuente extends Cliente{
    private double descuento = 0.1; 

    public ClienteFrecuente(String tipo, CarritoDeCompras carrito){
        super(tipo,carrito);
        this.descuento = descuento;
    }

    public double getDescuento(){
        return descuento;
    }

}