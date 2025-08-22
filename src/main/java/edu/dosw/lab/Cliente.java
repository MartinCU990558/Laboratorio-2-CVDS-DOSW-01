package edu.dosw.lab;

import java.util.ArrayList;

public abstract class Cliente{
    private String tipo;
    private CarritoDeCompras carrito; 
    
    public Cliente(String tipo,CarritoDeCompras carrito){
        this.tipo = tipo;
        this.carrito = carrito;
    }

    public String getTipo(){
        return tipo;
    }

    public CarritoDeCompras getCarrito(){
        return carrito;
    }
}