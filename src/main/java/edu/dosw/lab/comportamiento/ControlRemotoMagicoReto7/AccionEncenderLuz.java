package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

public class AccionEncenderLuz extends Accion {
    public AccionEncenderLuz(String usuario) {
        super(usuario, "Encender luz");
    }

    @Override
    public void ejecutar() {
        System.out.println("Acción ejecutada por " + usuario + ": Luz encendida");
    }

    @Override
    public void deshacer() {
        System.out.println("Acción deshecha: Luz apagada");
        super.deshacer();
    }
}
