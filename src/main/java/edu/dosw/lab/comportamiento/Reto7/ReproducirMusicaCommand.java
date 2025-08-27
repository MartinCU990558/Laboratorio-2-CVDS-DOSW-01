package edu.dosw.lab.comportamiento.Reto7;
public class ReproducirMusicaCommand extends AccionBase {
    public ReproducirMusicaCommand(String usuario) {
        super(usuario);
    }
    @Override
    public String getDescription() {
        return "Reproducir música";
    }
}
