package edu.dosw.lab.creacionales.FactoryMethod;

public class Helicoptero extends Vehiculo {
    public Helicoptero(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 250;
                this.precio = 300000000;
                this.equipamientoEspecial = "Asientos de cuero + Sistema de navegación básico";
                break;
            case "Lujo":
                this.velocidadMax = 400;
                this.precio = 600000000;
                this.equipamientoEspecial = "Asientos de cuero + Sistema de navegación avanzado + Aire acondicionado";
                break;
            case "Usado":
                this.velocidadMax = 550;
                this.precio = 1200000000;
                this.equipamientoEspecial = "Asientos de cuero + Sistema de navegación avanzado + Aire acondicionado + Entretenimiento a bordo";
                break;
        }
    }
}
