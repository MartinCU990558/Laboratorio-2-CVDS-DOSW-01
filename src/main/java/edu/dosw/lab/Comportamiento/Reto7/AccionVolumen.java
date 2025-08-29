package edu.dosw.lab.Comportamiento.Reto7;

public class AccionVolumen extends AccionGeneral{
    private String porcentaje;
    public AccionVolumen(String usuario, String porcentaje) {
        super(usuario, "Ajustar volumen a " + porcentaje + "%");
        this.porcentaje = porcentaje;
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion ejecutada por: "+ usuario + ": "+ descripcion);
    }

    @Override
    public void deshecha() {
        deshecha = true;
        System.out.println("Accion deshecha: Volumen regresado a 0%");
    }

}
