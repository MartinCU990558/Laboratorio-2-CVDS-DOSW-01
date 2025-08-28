public class DescuentoClienteFrecuente implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.10; 
    }
}