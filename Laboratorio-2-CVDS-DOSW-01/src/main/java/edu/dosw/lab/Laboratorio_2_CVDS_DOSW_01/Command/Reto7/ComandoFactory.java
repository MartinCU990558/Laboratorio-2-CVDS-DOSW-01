public class ComandoFactory {
    public static Comando crearComando(int opcion, String usuario, Luz luz, Puerta puerta, Musica musica, Persiana persiana, int... params) {
        switch(opcion) {
            case 1: return new EncenderLuz(luz, usuario);
            case 2: return new AbrirPuerta(puerta, usuario);
            case 3: return new ReproducirMusica(musica, usuario);
            case 4:
                int vol = params.length > 0 ? params[0] : 0;
                return new AjustarVolumen(musica, vol, usuario);
            case 5:
                int nivel = params.length > 0 ? params[0] : 0;
                return new AjustarPersiana(persiana, nivel, usuario); 
            default: throw new IllegalStateException("Opción inesperada");
        }
    }
}
