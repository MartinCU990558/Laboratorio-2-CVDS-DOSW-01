
public class ReproducirMusica extends ComandoBase {
    private final Musica musica;
    public ReproducirMusica(Musica musica, String usuario){ super(usuario); this.musica = musica; }

    @Override public void ejecutar(){ musica.reproducir(); }
    @Override public void deshacer(){ musica.pausar(); }
    @Override public String getDescripcion(){ return "Reproducir música"; }
}
