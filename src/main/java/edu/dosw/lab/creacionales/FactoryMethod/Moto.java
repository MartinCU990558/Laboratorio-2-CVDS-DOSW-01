package edu.dosw.lab.creacionales.FactoryMethod;

public class Moto extends Vehiculo {
    public Moto(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 100;
                this.precio = 15000000;
                this.equipamientoEspecial = "Casco incluido";
                break;
            case "Lujo":
                this.velocidadMax = 200;
                this.precio = 40000000;
                this.equipamientoEspecial = "Casco + Ropa de protección";
                break;
            case "Usado":
                this.velocidadMax = 80;
                this.precio = 8000000;
                this.equipamientoEspecial = "Casco incluido";
                break;
        }
    }
}
