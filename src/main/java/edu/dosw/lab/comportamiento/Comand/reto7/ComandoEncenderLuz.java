package edu.dosw.lab.comportamiento.Comand.reto7;

class ComandoEncenderLuz implements Comando {
    private DispositivoLuz dispositivo;
    private String usuario;

    public ComandoEncenderLuz(DispositivoLuz dispositivo, String usuario) {
        this.dispositivo = dispositivo;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        dispositivo.encender();
    }

    @Override
    public void deshacer() {
        dispositivo.apagar();
    }

    @Override
    public String getDescripcion() {
        return "Luz encendida";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
