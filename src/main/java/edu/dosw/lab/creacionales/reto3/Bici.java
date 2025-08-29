package edu.dosw.lab.creacionales.reto3;

public class Bici implements Vehicle{
    private final String categoria;
    private final int precio;
    private final int velMaxima;
    private final String equipamiento;

    public Bici(String categoria) {
        this.categoria = categoria;

        switch (categoria) {
            case "Económico" -> {
                this.precio = 50000;
                this.velMaxima = 600;
                this.equipamiento = "Básico";
            }
            case "Lujo" -> {
                this.precio = 150000;
                this.velMaxima = 900;
                this.equipamiento = "VIP, Asientos reclinables, Servicio gourmet";
            }
            case "Usado" -> {
                this.precio = 30000;
                this.velMaxima = 500;
                this.equipamiento = "Estandar, con desgaste";
            }
            default -> throw new IllegalArgumentException("Categoría no válida: " + categoria);
        }
    }

    @Override
    public String getTipo() {
        return "Tierra";
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getModelo() {
        return "Bici";
    }

    @Override
    public int getVelMaxima() {
        return velMaxima;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getEquipamento() {
        return equipamiento;
    }
}
