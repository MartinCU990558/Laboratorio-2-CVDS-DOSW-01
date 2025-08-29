package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
public class Musica {
    private boolean reproduciendo = false;
    private int volumen = 0; 

    public void reproducir() { reproduciendo = true; }
    public void pausar()     { reproduciendo = false; }
    public void setVolumen(int v) { volumen = Math.max(0, Math.min(100, v)); }

    public boolean isReproduciendo(){ return reproduciendo; }
    public int getVolumen(){ return volumen; }

    @Override public String toString(){
        return "Música " + (reproduciendo ? "reproduciendo" : "pausada") + " (vol=" + volumen + ")";
    }
}
