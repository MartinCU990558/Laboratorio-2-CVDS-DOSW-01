package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.solid;

public abstract class Cliente{
    public abstract double getDescuento();

    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}