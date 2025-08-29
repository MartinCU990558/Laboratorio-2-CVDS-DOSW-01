package edu.dosw.lab.creacionales.FactoryMethod;

public class JetSki extends Vehiculo {
    public JetSki(String categoria) {
        this.categoria = categoria;
        switch (categoria) {
            case "Económico":
                this.velocidadMax = 80;
                this.precio = 15000000;
                this.equipamientoEspecial = "Chaleco salvavidas básico";
                break;
            case "Lujo":
                this.velocidadMax = 120;
                this.precio = 30000000;
                this.equipamientoEspecial = "Chaleco salvavidas + Sistema de sonido";
                break;
            case "Usado":
                this.velocidadMax = 60;
                this.precio = 8000000;
                this.equipamientoEspecial = "Chaleco salvavidas básico";
                break;
        }
    }
}
