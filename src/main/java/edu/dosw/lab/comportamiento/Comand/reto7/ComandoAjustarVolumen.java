package edu.dosw.lab.comportamiento.Comand.reto7;

class ComandoAjustarVolumen implements Comando {
    private DispositivoVolumen dispositivo;
    private String usuario;
    private int nuevoVolumen;
    private int volumenAnterior;

    public ComandoAjustarVolumen(DispositivoVolumen dispositivo, String usuario, int volumen) {
        this.dispositivo = dispositivo;
        this.usuario = usuario;
        this.nuevoVolumen = volumen;
    }

    @Override
    public void ejecutar() {
        volumenAnterior = dispositivo.getVolumen();
        dispositivo.ajustarVolumen(nuevoVolumen);
    }

    @Override
    public void deshacer() {
        dispositivo.ajustarVolumen(volumenAnterior);
        System.out.println("Volumen regresado a " + volumenAnterior + "%");
    }

    @Override
    public String getDescripcion() {
        return "Ajustar volumen a " + nuevoVolumen + "%";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}