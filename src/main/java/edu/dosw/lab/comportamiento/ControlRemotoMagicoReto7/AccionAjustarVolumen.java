package edu.dosw.lab.comportamiento.ControlRemotoMagicoReto7;

public class AccionAjustarVolumen extends Accion {
    private int volumen;

    public AccionAjustarVolumen(String usuario, int volumen) {
        super(usuario, "Ajustar volumen a " + volumen + "%");
        this.volumen = volumen;
    }

    @Override
    public void ejecutar() {
        System.out.println("Acción ejecutada por " + usuario + ": Volumen ajustado a " + volumen + "%");
    }

    @Override
    public void deshacer() {
        System.out.println("Acción deshecha: Volumen regresado a 0%");
        super.deshacer();
    }
}
