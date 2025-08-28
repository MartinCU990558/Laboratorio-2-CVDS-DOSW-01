package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class Volume {
    private int level = 0;

    public void setLevel(int lvl) {
        level = Math.max(0, Math.min(100, lvl));
    }

    public int getLevel() {
        return level;
    }
}
