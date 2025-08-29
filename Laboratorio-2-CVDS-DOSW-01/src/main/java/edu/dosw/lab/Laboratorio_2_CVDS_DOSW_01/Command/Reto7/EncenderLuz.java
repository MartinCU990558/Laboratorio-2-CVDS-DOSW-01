package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
public class EncenderLuz extends ComandoBase {
    private final Luz luz;
    public EncenderLuz(Luz luz, String usuario) { super(usuario); this.luz = luz; }

    @Override public void ejecutar(){ luz.encender(); }
    @Override public void deshacer(){ luz.apagar(); }
    @Override public String getDescripcion(){ return "Encender luz"; }
}
