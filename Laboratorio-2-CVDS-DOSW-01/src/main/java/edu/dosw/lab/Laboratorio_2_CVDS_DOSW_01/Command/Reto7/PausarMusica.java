package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
 
public class PausarMusica extends ComandoBase {
    private final Musica musica;
    public PausarMusica(Musica musica, String usuario){ super(usuario); this.musica = musica; }

    @Override public void ejecutar(){ musica.pausar(); }
    @Override public void deshacer(){ musica.reproducir(); }
    @Override public String getDescripcion(){ return "Pausar música"; }
}
