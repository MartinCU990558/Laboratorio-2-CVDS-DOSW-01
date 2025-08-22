package edu.dosw.lab;

public class ClienteNuevo extends Cliente {
    private double descuento = 0.05; 

    public ClienteNuevo(String tipo,CarritoDeCompras carrito ,double descuento){
            super(tipo, carrito);
            this.descuento = descuento;
    }

    public double getDescuento(){
        return descuento;
    }
}
