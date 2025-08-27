package edu.dosw.lab.comportamiento.Reto7;
public class AjustarVolumenCommand extends AccionBase {
    private int volumen;
    public AjustarVolumenCommand(String usuario, int volumen) {
        super(usuario);
        this.volumen = volumen;
    }
    @Override
    public String getDescription() {
        return "Ajustar volumen a " + volumen + "%";
    }
}