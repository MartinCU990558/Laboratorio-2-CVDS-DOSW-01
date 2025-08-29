package edu.dosw.lab.creacionales.FactoryMethod;

public class Avioneta extends Vehiculo{
    public Avioneta(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 250;
                this.precio = 150000000;
                this.equipamientoEspecial = "Asientos de tela";
                break;
            case "Lujo":
                this.velocidadMax = 450;
                this.precio = 300000000;
                this.equipamientoEspecial = "Asientos de cuero + Entretenimiento a bordo";
                break;
            case "Usado":
                this.velocidadMax = 200;
                this.precio = 80000000;
                this.equipamientoEspecial = "Asientos de tela";
                break;
        }
    }
}
