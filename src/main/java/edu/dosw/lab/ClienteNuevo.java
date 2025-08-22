package edu.dosw.lab;

public class ClienteNuevo extends Cliente {
    private double descuento = 0.05; 

    public ClienteNuevo(String tipo, double descuento){
            super(tipo);
            this.descuento = descuento;
    }

    public double getDescuento(){
        return descuento;
    }
}
