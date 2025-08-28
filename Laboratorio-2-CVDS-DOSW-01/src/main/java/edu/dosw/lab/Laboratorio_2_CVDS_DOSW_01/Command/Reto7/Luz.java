
public class Luz {
    private boolean encendida = false;
    public void encender(){ encendida = true; }
    public void apagar(){ encendida = false; }
    public boolean isEncendida(){ return encendida; }
    @Override public String toString(){ return encendida ? "Luz encendida" : "Luz apagada"; }
}
