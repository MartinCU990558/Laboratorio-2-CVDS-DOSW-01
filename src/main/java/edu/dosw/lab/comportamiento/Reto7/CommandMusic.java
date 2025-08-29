package edu.dosw.lab.comportamiento.Reto7;

public class CommandMusic implements Command {
    private Music music;
    private boolean turnOn;
    private String user;

    public CommandMusic(Music music, boolean turnOn, String user) {
        this.music = music;
        this.turnOn = turnOn;
        this.user = user;
    }

    @Override
    public void execute() {
        if (turnOn) {
            music.musicOn();
        } else {
            music.musicOff();
        }
    }
    
    @Override
    public void undo() {
        if (turnOn) {
            music.musicOff();
        } else {
            music.musicOn();
        }
    }
    
    @Override
    public String getUser() {
        return user;
    }
    
    @Override
    public String getDescription() {
        return turnOn ? "Reproducir musica" : "Detener musica";
    }
}