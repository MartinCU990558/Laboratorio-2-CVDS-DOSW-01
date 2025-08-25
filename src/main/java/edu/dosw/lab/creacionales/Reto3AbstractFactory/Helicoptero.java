package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Helicoptero extends Vehiculo {
    public Helicoptero(Categoria categoria) {
        this.tipo = "Helicoptero";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "200 km/h";
                this.precio = 200000000;
                this.equipamentoEspecial = "Cabina simple, radio comunicación";
                break;
            case LUJO:
                this.velocidadMax = "350 km/h";
                this.precio = 350000000;
                this.equipamentoEspecial = "inerior VIP, sistema antivibración";
                break;
            case USADO:
                this.velocidadMax = "280 km/h";
                this.precio = 220000000;
                this.equipamentoEspecial = "Asientos comodos, piloto automatico parcial";
                break;
        }
    }
}
