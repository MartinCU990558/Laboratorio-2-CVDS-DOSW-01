package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Avioneta extends Vehiculo {
    public Avioneta(Categoria categoria) {
        this.tipo = "Avioneta";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "250 km/h";
                this.precio = 60000000;
                this.equipamentoEspecial = "Cabina simple, GPS estándar";
                break;
            case LUJO:
                this.velocidadMax = "500 km/h";
                this.precio = 80000000;
                this.equipamentoEspecial = "Interior premium, panel digital, aire acondicionado";
                break;
            case USADO:
                this.velocidadMax = "300 km/h";
                this.precio = 70000000;
                this.equipamentoEspecial = "Asientos mejorados, piloto automatico";
                break;
        }
    }
}
