package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

public class AccionReproducirMusica extends Accion {
    public AccionReproducirMusica(String usuario) {
        super(usuario, "Reproducir música");
    }

    @Override
    public void ejecutar() {
        System.out.println("Acción ejecutada por " + usuario + ": Música reproducida");
    }

    @Override
    public void deshacer() {
        System.out.println("Acción deshecha: Música detenida");
        super.deshacer();
    }
}
