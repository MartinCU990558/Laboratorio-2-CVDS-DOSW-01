package edu.dosw.lab.comportamiento.Reto7;


public class ComandoPuerta implements Comando {
    private Puerta puerta;
    private String usuario;

    public ComandoPuerta(Puerta puerta, String accion, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
        puerta.abrir();
    }

    @Override
    public void ejecutar() {
        puerta.abrir();
    }

    @Override
    public void deshacer() {
        puerta.cerrar();
    }

    @Override
    public String getDescripcion() {
        return "Abrir puerta";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipoDispositivo() {
        return "Puerta";
    }
}