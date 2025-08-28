package edu.dosw.lab.Comportamiento.Reto7;

public class AccionPuerta extends AccionGeneral{
    public AccionPuerta(String usuario) {
        super(usuario, "Puerta abierta");
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion ejecutada por "+ usuario + ": " + descripcion);
    }

    @Override
    public void deshecha() {
        deshecha = true;
        System.out.println("Accion deshecha por "+ usuario + ": Puerta cerrada" );
    }
}
