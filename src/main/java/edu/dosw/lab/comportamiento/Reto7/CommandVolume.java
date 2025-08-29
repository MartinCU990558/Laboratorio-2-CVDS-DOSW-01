package edu.dosw.lab.comportamiento.Reto7;

public class CommandVolume implements Command {
    private Volume volume;
    private int previousLevel;
    private int newLevel;
    private String user;

    public CommandVolume(Volume volume, int newLevel, String user) {
        this.volume = volume;
        this.newLevel = newLevel;
        this.user = user;
    }

    @Override
    public void execute() {
        previousLevel = volume.getLevel();
        volume.setLevel(newLevel);
        System.out.println("Volumen ajustado a " + newLevel + "%");
    }
    
    @Override
    public void undo() {
        volume.setLevel(previousLevel);
        System.out.println("Volumen restaurado a " + previousLevel + "%");
    }
    
    @Override
    public String getUser() {
        return user;
    }
    
    @Override
    public String getDescription() {
        return "Ajustar volumen a " + newLevel + "%";
    }
}