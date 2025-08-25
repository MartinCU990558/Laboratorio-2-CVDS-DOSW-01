package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Velero extends Vehiculo {
    public Velero(Categoria categoria) {
        this.tipo = "Velero";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "40 km/h";
                this.precio = 25000000;
                this.equipamentoEspecial = "Vela estandar";
                break;
            case LUJO:
                this.velocidadMax = "80 km/h";
                this.precio = 60000000;
                this.equipamentoEspecial = "Velas de carbono";
                break;
            case USADO:
                this.velocidadMax = "55 km/h";
                this.precio = 30000000;
                this.equipamentoEspecial = "Vela reforzada";
                break;
        }
    }
}
