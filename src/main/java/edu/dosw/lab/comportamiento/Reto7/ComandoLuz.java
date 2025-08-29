package edu.dosw.lab.comportamiento.Reto7;


public class ComandoLuz implements Comando {
    private Luz luz;
    private String usuario;
    private int brillo;

    public ComandoLuz(Luz luz, String accion, String usuario, int brillo) {
        this.luz = luz;
        this.usuario = usuario;
        this.brillo = brillo;
        luz.encender();
        luz.ajustarBrillo(brillo);
    }

    @Override
    public void ejecutar() {
        luz.encender();
        luz.ajustarBrillo(brillo);
    }

    @Override
    public void deshacer() {
        luz.apagar();
        luz.ajustarBrillo(50); 
    }

    @Override
    public String getDescripcion() {
        return "Encender luz";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipoDispositivo() {
        return "Luz";
    }
}