package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Avion extends Vehiculo {
    public Avion(Categoria categoria) {
        this.tipo = "Avion";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "650 km/h";
                this.precio = 240000000;
                this.equipamentoEspecial = "Cabina básica, 2 motores estandar";
                break;
            case LUJO:
                this.velocidadMax = "1100 km/h";
                this.precio = 1000000000;
                this.equipamentoEspecial = "Suite privada, WiFi satelital, cocima completa";
                break;
            case USADO:
                this.velocidadMax = "750 km/h";
                this.precio = 320000000;
                this.equipamentoEspecial = "Asientos de cuero, piloto automatico basico";
                break;
        }
    }
}
