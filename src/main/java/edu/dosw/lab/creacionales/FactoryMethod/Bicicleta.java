package edu.dosw.lab.creacionales.FactoryMethod;

public class Bicicleta extends Vehiculo {
    public Bicicleta(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 40;
                this.precio = 2000000;
                this.equipamientoEspecial = "Suspensión delantera";
                break;
            case "Lujo":
                this.velocidadMax = 60;
                this.precio = 3000000;
                this.equipamientoEspecial = "Neumáticos delgados";
                break;
            case "Usado":
                this.velocidadMax = 50;
                this.precio = 2500000;
                this.equipamientoEspecial = "Combinación de características de montaña y ruta";
                break;
        }
    }
}
