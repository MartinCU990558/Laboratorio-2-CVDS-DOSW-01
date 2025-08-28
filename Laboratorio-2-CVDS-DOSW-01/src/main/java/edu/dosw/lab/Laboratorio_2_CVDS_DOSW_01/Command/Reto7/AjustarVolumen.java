
public class AjustarVolumen extends ComandoBase {
    private final Musica musica;
    private final int nuevoVolumen;
    private int volumenAnterior;

    public AjustarVolumen(Musica musica, int nuevoVolumen, String usuario){
        super(usuario);
        this.musica = musica;
        this.nuevoVolumen = nuevoVolumen;
    }

    @Override public void ejecutar(){
        volumenAnterior = musica.getVolumen();
        musica.setVolumen(nuevoVolumen);
    }

    @Override public void deshacer(){
        musica.setVolumen(volumenAnterior);
    }

    @Override public String getDescripcion(){ return "Ajustar volumen a " + nuevoVolumen + "%"; }
}
