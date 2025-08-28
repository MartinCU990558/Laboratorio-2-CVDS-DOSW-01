package edu.dosw.lab.Comportamiento.Reto7;

import java.lang.ref.SoftReference;

public class AccionLuz extends AccionGeneral{
    public AccionLuz(String usuario) {
        super(usuario, "Luz encendida");
    }

    @Override
    public void ejecutar() {
        System.out.println("Accion ejecutada por " + usuario + ":" + descripcion);

    }

    @Override
    public void deshecha() {
    deshecha = true;
    System.out.println("Accion deshecha por :" + usuario + ": Luz apagada");
    }
}
