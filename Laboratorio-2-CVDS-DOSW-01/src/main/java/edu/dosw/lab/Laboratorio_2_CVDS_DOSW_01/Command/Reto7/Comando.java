

public interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
    String getUsuario();
}
