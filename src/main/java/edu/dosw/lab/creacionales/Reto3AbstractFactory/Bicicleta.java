package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Bicicleta extends Vehiculo {
    public Bicicleta(Categoria categoria) {
        this.tipo = "Bicicleta";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "45 km/h";
                this.precio = 2500000;
                this.equipamentoEspecial = "Cambios basicos";
                break;
            case LUJO:
                this.velocidadMax = "50 km/h";
                this.precio = 6000000;
                this.equipamentoEspecial = "Cambios y luz integrada";
                break;
            case USADO:
                this.velocidadMax = "35 km/h";
                this.precio = 1200000;
                this.equipamentoEspecial = "Campana";
            break;
        }
    }
}
