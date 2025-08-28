import java.time.LocalDateTime;

public abstract class ComandoBase implements Comando {
    protected final String usuario;
    protected final LocalDateTime fechaHora;
    private boolean deshecha = false;

    protected ComandoBase(String usuario) {
        this.usuario = usuario;
        this.fechaHora = LocalDateTime.now();
    }

    @Override public String getUsuario() { return usuario; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    // Marcado para el historial
    public void marcarDeshecha(){ this.deshecha = true; }
    public boolean estaDeshecha(){ return deshecha; }
}
