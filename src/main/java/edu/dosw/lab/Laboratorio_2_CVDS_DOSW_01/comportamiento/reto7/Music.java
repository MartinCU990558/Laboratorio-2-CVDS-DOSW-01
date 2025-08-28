package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class Music {
    private boolean playing = false;

    public void play() {
        playing = true;
    }

    public void stop() {
        playing = false;
    }

    public boolean isPlaying() {
        return playing;
    }
}
