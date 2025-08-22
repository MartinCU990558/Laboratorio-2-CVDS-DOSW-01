package edu.dosw.lab;

public class Cliente{
    private String tipo;
    CarritoDeCompras carrito; 
    
    public Cliente(String tipo, CarritoDeCompras carrito){
            this.tipo = tipo;
            this.carrito = carrito;
    }

    public String getTipo(){
        return tipo;
    }

    public double calcularDescuento(){
        if (tipo == "Frecuente"){
            return carrito.total()*0.1;
        }
        return carrito.total()*0.05;
    };
}


