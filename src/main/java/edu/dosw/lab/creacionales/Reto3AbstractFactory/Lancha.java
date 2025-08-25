package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Lancha extends Vehiculo{
    public Lancha(Categoria categoria) {
        this.tipo = "Lancha";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "60 km/h";
                this.precio = 85000000;
                this.equipamentoEspecial = "Motor basico";
                break;
            case LUJO:
                this.velocidadMax = "150 km/h";
                this.precio = 150000000;
                this.equipamentoEspecial = "Sistema de sonido premium, tapiceria";
                break;
            case USADO:
                this.velocidadMax = "90 km/h";
                this.precio = 95000000;
                this.equipamentoEspecial = "Sonido basico";
                break;
        }
    }
}
