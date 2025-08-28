
import java.util.Arrays;
import java.util.List;

public class VehiculoFactory {

    public enum Tipo { TIERRA, ACUATICO, AEREO }

    public static List<String> modelosPorTipo(Tipo tipo) {
        switch (tipo) {
            case TIERRA:
                return Arrays.asList("Auto", "Bicicleta", "Moto");
            case ACUATICO:
                return Arrays.asList("Lancha", "Velero", "Jet Ski");
            case AEREO:
                return Arrays.asList("Avión", "Avioneta", "Helicóptero");
            default:
                throw new IllegalArgumentException("Tipo de vehículo no soportado");
        }
    }

    public static Vehiculo crearPorModelo(String modelo) {
        String m = modelo.trim().toLowerCase();
        switch (m) {
            case "auto":        return new Auto();
            case "moto":        return new Moto();
            case "bicicleta":   return new Bicicleta();
            case "lancha":      return new Lancha();
            case "velero":      return new Velero();
            case "jet ski":     return new JetSki();
            case "avión":
            case "avion":       return new Avion();
            case "avioneta":    return new Avioneta();
            case "helicóptero":
            case "helicoptero": return new Helicoptero();
            default: throw new IllegalArgumentException("Modelo no soportado: " + modelo);
        }
    }
}
