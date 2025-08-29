package edu.dosw.lab.Comportamiento.Reto7;

public  class EnLuz extends BaseCommand {
    private Luz luz;

    public EnLuz(Luz luz, String usuario) {
        super(usuario);
        this.luz = luz;
    }

    public void execute() {
        luz.encender();
    }

    public void undo() {
        luz.apagar();
    }

    public String getDescripcion() {
        return "Encender luz";
    }

    @Override
    public String getUndoDescripcion() {
        return "Volumen regresado a 0%";
    }
}
