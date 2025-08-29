package edu.dosw.lab.comportamiento.Comand.reto7;

class ComandoReproducirMusica implements Comando {
    private DispositivoMusica dispositivo;
    private String usuario;

    public ComandoReproducirMusica(DispositivoMusica dispositivo, String usuario) {
        this.dispositivo = dispositivo;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        dispositivo.reproducir();
    }

    @Override
    public void deshacer() {
        dispositivo.detener();
    }

    @Override
    public String getDescripcion() {
        return "Música reproducida";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
