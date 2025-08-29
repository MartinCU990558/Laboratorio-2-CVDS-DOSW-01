package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
public class ApagarLuz extends ComandoBase {
    private final Luz luz;
    public ApagarLuz(Luz luz, String usuario) { super(usuario); this.luz = luz; }

    @Override public void ejecutar(){ luz.apagar(); }
    @Override public void deshacer(){ luz.encender(); }
    @Override public String getDescripcion(){ return "Apagar luz"; }
}
