package edu.dosw.lab.comportamiento.Comand.reto7;

class ComandoAbrirPuerta implements Comando {
    private DispositivoPuerta dispositivo;
    private String usuario;

    public ComandoAbrirPuerta(DispositivoPuerta dispositivo, String usuario) {
        this.dispositivo = dispositivo;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        dispositivo.abrir();
    }

    @Override
    public void deshacer() {
        dispositivo.cerrar();
    }

    @Override
    public String getDescripcion() {
        return "Puerta abierta";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}