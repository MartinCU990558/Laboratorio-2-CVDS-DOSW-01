package edu.dosw.lab.creacionales.Reto8;

public class Ave extends Animal {
    public Ave(String nombre, int edad, String sonidoCaracteristico, String dieta,
               String alimentoPreferido, double peso, double altura, EstadoSalud estadoSalud, String habitat) {
        super(nombre, edad, sonidoCaracteristico, dieta, alimentoPreferido, peso, altura, estadoSalud, habitat);
    }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace un sonido de ave: " + super.sonidoCaracteristico);
    }
}
