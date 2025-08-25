package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class Auto extends Vehiculo{
    public Auto(Categoria categoria) {
        this.tipo = "Auto";
        this.categoria = categoria.name();
        switch (categoria){
            case ECONOMICO:
                this.velocidadMax = "120 km/h";
                this.precio = 25000000;
                this.equipamentoEspecial = "Aire acondicionado basico";
                break;
            case LUJO:
                this.velocidadMax = "180 km/h";
                this.precio = 50000000;
                this.equipamentoEspecial = "Aire acondicionado + GPS";
                break;
            case USADO:
                this.velocidadMax = "100 km/h";
                this.precio = 15000000;
                this.equipamentoEspecial = "Aire acondicionado desgastado";
                break;
        }
    }
}
