package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Moto extends Vehiculo{
    public Moto(Categoria categoria){
        this.tipo = "Moto";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "140 km/h";
                this.precio = 18000000;
                this.equipamentoEspecial = "GPS integrado";
                break;
            case LUJO:
                this.velocidadMax = "180 km/h";
                this.precio = 25000000;
                this.equipamentoEspecial = "GPS integrado y casco especial";
                break;
            case USADO:
                this.velocidadMax = "115 km/h";
                this.precio = 12000000;
                this.equipamentoEspecial = "No tiene equipamiento especial";
                break;
        }
    }

}
