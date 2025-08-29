package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;

public class AbrirPuerta extends ComandoBase {
    private final Puerta puerta;
    public AbrirPuerta(Puerta puerta, String usuario) { super(usuario); this.puerta = puerta; }

    @Override public void ejecutar(){ puerta.abrir(); }
    @Override public void deshacer(){ puerta.cerrar(); }
    @Override public String getDescripcion(){ return "Abrir puerta"; }
}
