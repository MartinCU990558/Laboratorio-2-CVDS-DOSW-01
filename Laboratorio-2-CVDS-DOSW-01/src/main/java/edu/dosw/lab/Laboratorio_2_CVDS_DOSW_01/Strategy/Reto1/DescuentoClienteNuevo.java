
public class DescuentoClienteNuevo implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.05; 
    
    }
}