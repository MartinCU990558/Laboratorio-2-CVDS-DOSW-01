package src.main.java.edu.dosw.lab.Creacionales.Reto2;

/**
 * Clase que abstrae los ingredientes de los cuales
 * se compondrá la 'hamburgueja'.
 */
public class Ingredients {
    private final String nombreIngrediente;
    private final double precioIngrediente;

    /**
     * Método constructor de los ingredientes de la hamburguesa.
     * @param nombreIngrediente
     * @param precioIngrediente
     */
    public Ingredients(String nombreIngrediente, double precioIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
        this.precioIngrediente = precioIngrediente;
    }

    public String getNombreIngrediente() {return nombreIngrediente;}
    public double getPrecioIngrediente() {return precioIngrediente;}

    @Override
    public String toString() {
        return nombreIngrediente + " ($" + precioIngrediente + ")";
    }
}
