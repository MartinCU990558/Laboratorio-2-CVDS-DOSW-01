package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.creacionales.Reto2;

public class Ingrediente {
    private String nombre;
    private Int precio;

    public ingrediente(String nombre,Int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public int getprecio(){
        return precio;
    }
}
