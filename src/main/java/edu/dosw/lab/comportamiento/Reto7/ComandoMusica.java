package edu.dosw.lab.comportamiento.Reto7;

public class ComandoMusica implements Comando {
    private ReproductorMusica reproductor;
    private String usuario;

    public ComandoMusica(ReproductorMusica reproductor, String accion, String usuario) {
        this.reproductor = reproductor;
        this.usuario = usuario;
        reproductor.reproducir();
    }

    @Override
    public void ejecutar() {
        reproductor.reproducir();
    }

    @Override
    public void deshacer() {
        reproductor.detener();
    }

    @Override
    public String getDescripcion() {
        return "Reproducir música";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipoDispositivo() {
        return "Música";
    }
}