package edu.dosw.lab.comportamiento.Reto7;
public class CommandBlinds implements Command {
    private Blinds blinds;
    private int previousLevel;
    private int newLevel;
    private String user;

    public CommandBlinds(Blinds blinds, int newLevel, String user) {
        this.blinds = blinds;
        this.newLevel = newLevel;
        this.user = user;
    }

    @Override
    public void execute() {
        previousLevel = blinds.getLevel();
        blinds.setLevel(newLevel);
        System.out.println("Persianas ajustadas a " + newLevel);
    }
    
    @Override
    public void undo() {
        blinds.setLevel(previousLevel);
        System.out.println("Persianas restauradas a " + previousLevel);
    }
    
    @Override
    public String getUser() {
        return user;
    }
    
    @Override
    public String getDescription() {
        return "Ajustar persianas a nivel " + newLevel;
    }
}