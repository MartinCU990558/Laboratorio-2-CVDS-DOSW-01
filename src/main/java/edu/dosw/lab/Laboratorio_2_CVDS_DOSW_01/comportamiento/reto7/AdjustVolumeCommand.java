package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class AdjustVolumeCommand implements Command {
    private final Volume volume;
    private final int adjustLevel;
    private int previousLevel = 0;

    public AdjustVolumeCommand(Volume volume, int level) {
        this.volume = volume;
        this.adjustLevel = Math.max(0, Math.min(100, level));
    }

    @Override
    public String execute() {
        previousLevel = volume.getLevel();
        volume.setLevel(adjustLevel);
        return "Volumen ajustado a " + adjustLevel + "%";
    }

    @Override
    public String undo() {
        volume.setLevel(previousLevel);
        return "Volumen regresado a " + previousLevel + "%";
    }

    @Override
    public String getDescription() {
        return "Ajustar volumen a " + adjustLevel + "%";
    }
}
