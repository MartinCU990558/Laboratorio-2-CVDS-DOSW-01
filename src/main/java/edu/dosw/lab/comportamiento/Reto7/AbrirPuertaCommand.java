package edu.dosw.lab.comportamiento.Reto7;
public class AbrirPuertaCommand extends AccionBase {
    public AbrirPuertaCommand(String usuario) {
        super(usuario);
    }
    @Override
    public String getDescription() {
        return "Abrir puerta";
    }
}
