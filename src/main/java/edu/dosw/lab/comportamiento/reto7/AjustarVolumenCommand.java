package edu.dosw.lab.comportamiento.reto7;

public class AjustarVolumenCommand implements Command {
    private String usuario;
    private int valor;
    private int valorAnterior;
    private boolean ejecutado;

    public AjustarVolumenCommand(String usuario, int valor) {
        this.usuario = usuario;
        this.valor = valor;
        this.valorAnterior = 50; // Valor por defecto
        this.ejecutado = false;
    }

    @Override
    public String execute() {
        this.ejecutado = true;
        return "Volumen ajustado a " + valor + " por " + usuario;
    }

    @Override
    public String undo() {
        if (ejecutado) {
            ejecutado = false;
            return "Volumen restaurado a " + valorAnterior + " (deshacer acción de " + usuario + ")";
        }
        return "El volumen ya estaba en su valor anterior";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getTipo() {
        return "AjustarVolumen";
    }
}