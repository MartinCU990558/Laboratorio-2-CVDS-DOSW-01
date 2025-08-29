package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
public class AjustarPersiana extends ComandoBase {
    private final Persiana persiana;
    private final int nuevoNivel;
    private int nivelAnterior;

    public AjustarPersiana(Persiana persiana, int nuevoNivel, String usuario){
        super(usuario);
        this.persiana = persiana;
        this.nuevoNivel = nuevoNivel;
    }

    @Override public void ejecutar(){
        nivelAnterior = persiana.getNivel();
        persiana.setNivel(nuevoNivel);
    }

    @Override public void deshacer(){
        persiana.setNivel(nivelAnterior);
    }

    @Override public String getDescripcion(){ return "Ajustar persiana a " + nuevoNivel + "%"; }
}
