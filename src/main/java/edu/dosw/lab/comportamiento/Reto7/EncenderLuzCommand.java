package edu.dosw.lab.comportamiento.Reto7;
public class EncenderLuzCommand extends AccionBase {
    public EncenderLuzCommand(String usuario) {
        super(usuario);
    }
    @Override
    public String getDescription() {
        return "Encender luz";
    }
}