package edu.dosw.lab.Comportamiento.Reto7;

public class OPuerta  extends BaseCommand {
    private Puerta puerta;

    public OPuerta(Puerta puerta, String usuario) {
        super(usuario);
        this.puerta = puerta;
    }

    public void execute() {
        puerta.abrir();
    }

    public void undo() {
        puerta.cerrar();
    }

    public String getDescripcion() {
        return "Abrir puerta";
    }


}
