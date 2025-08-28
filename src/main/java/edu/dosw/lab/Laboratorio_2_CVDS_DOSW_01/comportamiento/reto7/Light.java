package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class Light {
    private boolean on = false;

    public void turnOn() { on = true; }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
