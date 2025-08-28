package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7;

public class PlayMusicCommand implements Command {
    private final Music player;

    public PlayMusicCommand(Music player) {
        this.player = player;
    }

    @Override
    public String execute() {
        if (player.isPlaying()) {
            return "Música ya en reproducción";
        }
        player.play();
        return "Música reproducida";
    }

    @Override
    public String undo() {
        if (!player.isPlaying()) {
            return "Música ya detenida";
        }
        player.stop();
        return "Música detenida";
    }

    @Override
    public String getDescription() {
        return "Reproducir música";
    }
}
