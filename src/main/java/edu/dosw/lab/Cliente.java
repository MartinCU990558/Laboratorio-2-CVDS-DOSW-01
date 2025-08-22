package edu.dosw.lab;

import java.util.ArrayList;

public class Cliente{
    private String tipo;
    CarritoDeCompras carrito; 
    
    public Cliente(String tipo,CarritoDeCompras carrito){
        this.tipo = tipo;
        this.carrito = carrito;
    }

    public String getTipo(){
        return tipo;
    }

    

}