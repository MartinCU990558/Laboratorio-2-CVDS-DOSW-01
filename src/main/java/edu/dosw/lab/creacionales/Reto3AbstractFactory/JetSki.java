package edu.dosw.lab.creacionales.Reto3AbstractFactory;

public class JetSki extends Vehiculo{
    public JetSki(Categoria categoria) {
        this.tipo = "Jet Ski";
        this.categoria = categoria.name();
        switch(categoria){
            case ECONOMICO:
                this.velocidadMax = "70 km/h";
                this.precio = 18000000;
                this.equipamentoEspecial = "Motor basico";
                break;
            case LUJO:
                this.velocidadMax = "140 km/h";
                this.precio = 35000000;
                this.equipamentoEspecial = "pantalla digital, motor turbo";
                break;
            case USADO:
                this.velocidadMax = "100 km/h";
                this.precio = 19500000;
                this.equipamentoEspecial = "asientos ergonómicos";
                break;
        }
    }
}
