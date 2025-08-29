package edu.dosw.lab.comportamiento.Reto7;

public class ComandoVolumen implements Comando {
    private ReproductorMusica reproductor;
    private String usuario;
    private int volumen;

    public ComandoVolumen(ReproductorMusica reproductor, String usuario, int volumen) {
        this.reproductor = reproductor;
        this.usuario = usuario;
        this.volumen = volumen;
        reproductor.ajustarVolumen(volumen);
    }

    @Override
    public void ejecutar() {
        reproductor.ajustarVolumen(volumen);
    }

    @Override
    public void deshacer() {
        reproductor.ajustarVolumen(50); 
    }

    @Override
    public String getDescripcion() {
        return "Ajustar volumen a " + volumen + "%";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipoDispositivo() {
        return "Volumen";
    }
}