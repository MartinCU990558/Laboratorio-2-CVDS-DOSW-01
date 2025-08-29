package edu.dosw.lab.creacionales.FactoryMethod;

public class Avion extends Vehiculo {
    public Avion(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 300;
                this.precio = 200000000;
                this.equipamientoEspecial = "Asientos de tela";
                break;
            case "Lujo":
                this.velocidadMax = 600;
                this.precio = 800000000;
                this.equipamientoEspecial = "Asientos de cuero + Entretenimiento a bordo";
                break;
            case "Usado":
                this.velocidadMax = 250;
                this.precio = 100000000;
                this.equipamientoEspecial = "Asientos de tela";
                break;
        }
    }
}
