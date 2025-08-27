package edu.dosw.lab.Comportamiento.Reto7;

public class AVolumen extends BaseCommand {
    private Volumen volumen;
    private int valor;

    public AVolumen(Volumen volumen, int valor, String usuario) {
        super(usuario);
        this.volumen = volumen;
        this.valor = valor;
    }

    public void execute() {
        volumen.ajustar(valor);
    }

    public void undo() {
        volumen.resetear();
    }

    public String getDescripcion() {
        return "Ajustar volumen a " + valor + "%";
    }

}
