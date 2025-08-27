package edu.dosw.lab.creacionales.ReinoDeLosVehiculos;
import java.util.List;

public class ComprarVehiculo {

    public void imprimirResumen(List<Vehiculo> vehiculos) {
        System.out.println("---- RESUMEN DE COMPRA ---");

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            System.out.printf("Vehículo %d:\nModelo: %s\nCategoría: %s\nVelocidad máxima: %d km/h\nPrecio: $%,.0f\nEquipamiento: %s\n\n",
                    i+1, v.getModelo(), v.getCategoria(), v.getVelocidadMax(), v.getPrecio(), v.getEquipamiento());
        }

        double subtotal = vehiculos.stream().mapToDouble(Vehiculo::getPrecio).sum();
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $0");
        System.out.println("Total a pagar: $" + subtotal);
    }
}
