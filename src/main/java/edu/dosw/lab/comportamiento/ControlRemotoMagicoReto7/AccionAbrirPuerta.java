package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

public class AccionAbrirPuerta extends Accion {
    public AccionAbrirPuerta(String usuario) {
        super(usuario, "Abrir puerta");
    }

    @Override
    public void ejecutar() {
        System.out.println("Acción ejecutada por " + usuario + ": Puerta abierta");
    }

    @Override
    public void deshacer() {
        System.out.println("Acción deshecha: Puerta cerrada");
        super.deshacer();
    }
}
