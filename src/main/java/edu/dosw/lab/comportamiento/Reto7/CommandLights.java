package edu.dosw.lab.comportamiento.Reto7;

public class CommandLights implements Command {
    private Lights lights;
    private boolean turnOn;
    private String user;

    public CommandLights(Lights lights, boolean turnOn, String user) {
        this.lights = lights;
        this.turnOn = turnOn;
        this.user = user;
    }

    @Override
    public void execute() {
        if (turnOn) {
            lights.lightsOn();
        } else {
            lights.lightsOff();
        }
    }
    
    @Override
    public void undo() {
        if (turnOn) {
            lights.lightsOff();
        } else {
            lights.lightsOn();
        }
    }
    
    @Override
    public String getUser() {
        return user;
    }
    
    @Override
    public String getDescription() {
        return turnOn ? "Encender luz" : "Apagar luz";
    }
}