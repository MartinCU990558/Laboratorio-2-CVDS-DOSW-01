package edu.dosw.lab.Comportamiento.Reto7;

public class RMusica  extends BaseCommand {
    private Musica musica;

    public RMusica(Musica musica, String usuario) {
        super(usuario);
        this.musica = musica;
    }

    public void execute() {
        musica.reproducir();
    }

    public void undo() {
        musica.detener();
    }

    public String getDescripcion() {
        return "Reproducir música";
    }



}