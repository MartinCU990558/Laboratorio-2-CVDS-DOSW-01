package edu.dosw.lab.Comportamiento.Reto7;

public class AccionPonerMusica extends AccionGeneral{
    public AccionPonerMusica(String usuario){
        super(usuario, "Musica repreoducida");
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion ejecutada por: "+usuario+":"+descripcion);
    }

    @Override
    public void deshecha() {
        deshecha = true;
        System.out.println("Accion deshecha: Musica detenida");
    }
}
