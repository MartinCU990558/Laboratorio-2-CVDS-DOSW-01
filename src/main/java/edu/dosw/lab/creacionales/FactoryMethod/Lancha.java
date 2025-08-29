package edu.dosw.lab.creacionales.FactoryMethod;

public class Lancha extends Vehiculo {
    public Lancha(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 40;
                this.precio = 20000000;
                this.equipamientoEspecial = "Chaleco salvavidas incluido";
                break;
            case "Lujo":
                this.velocidadMax = 70;
                this.precio = 50000000;
                this.equipamientoEspecial = "Chaleco salvavidas + GPS";
                break;
            case "Usado":
                this.velocidadMax = 100;
                this.precio = 100000000;
                this.equipamientoEspecial = "Chaleco salvavidas + GPS + Sistema de sonido";
                break;
        }
    }
}
