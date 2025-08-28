
public class Persiana {
    private int nivel = 0; 

    public void setNivel(int nivel) { this.nivel = Math.max(0, Math.min(100, nivel)); }
    public int getNivel(){ return nivel; }

    @Override public String toString(){ return "Persiana nivel " + nivel + "%"; }
}
