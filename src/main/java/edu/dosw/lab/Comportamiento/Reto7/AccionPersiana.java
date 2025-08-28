package edu.dosw.lab.Comportamiento.Reto7;

public class AccionPersiana extends AccionGeneral{
    public AccionPersiana(String usuario){
        super(usuario, "Ajustar perciana")
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion ");
    }

    @Override
    public void deshecha() {

    }
}
