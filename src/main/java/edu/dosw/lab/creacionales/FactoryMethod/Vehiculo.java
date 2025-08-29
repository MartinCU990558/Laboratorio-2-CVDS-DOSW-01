package edu.dosw.lab.creacionales.FactoryMethod;

public abstract class Vehiculo  {
    protected String categoria;
    protected int velocidadMax;
    protected int precio;
    protected String equipamientoEspecial;

    protected void mostrarInfo() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Categoría: " + categoria);
        System.out.println("Velocidad Máxima: " + velocidadMax + " km/h");
        System.out.printf("precio: $%,d",precio);
        System.out.println("\nEquipamiento: " + equipamientoEspecial);
    }
}
