
public class CerrarPuerta extends ComandoBase {
    private final Puerta puerta;
    public CerrarPuerta(Puerta puerta, String usuario) { super(usuario); this.puerta = puerta; }

    @Override public void ejecutar(){ puerta.cerrar(); }
    @Override public void deshacer(){ puerta.abrir(); }
    @Override public String getDescripcion(){ return "Cerrar puerta"; }
}
