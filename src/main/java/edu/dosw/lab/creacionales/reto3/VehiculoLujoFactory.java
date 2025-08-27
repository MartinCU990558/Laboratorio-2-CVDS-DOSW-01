package edu.dosw.lab.creacionales.reto3;

public class VehiculoLujoFactory extends VehiculoAbstractFactory {
    
    @Override
    public Vehiculo crearVehiculo(int tipo, int modelo) {
        if(tipo == 1){ 
            if(modelo == 1){ 
                return new Vehiculo("Auto", "Terrestre", "Lujo", 80000, 250, "Cuero italiano, GPS premium, Motor V8");
            }
            if(modelo == 2){
                return new Vehiculo("Bicicleta", "Terrestre", "Lujo", 2000, 35, "Marco carbono profesional, cambios electrónicos");
            }
            if(modelo == 3){ 
                return new Vehiculo("Moto", "Terrestre", "Lujo", 25000, 180, "Ducati deportiva, fibra de carbono, ABS");
            }
        }

        if(tipo == 2){ 
            if(modelo == 1){ 
                return new Vehiculo("Lancha", "Acuatico", "Lujo", 150000, 120, "Motor V8 marino, GPS, sonar premium");
            }
            if(modelo == 2){ 
                return new Vehiculo("Velero", "Acuatico", "Lujo", 200000, 85, "Velas profesionales, cabina ejecutiva");
            }
            if(modelo == 3){ 
                return new Vehiculo("Jet Ski", "Acuatico", "Lujo", 35000, 110, "Motor turbo premium, asientos de cuero");
            }
        }

        if(tipo == 3){
            if(modelo == 1){ 
                return new Vehiculo("Avion", "Aereo", "Lujo", 800000, 900, "Bimotor, cabina ejecutiva, piloto automático");
            }
            if(modelo == 2){ 
                return new Vehiculo("Avioneta", "Aereo", "Lujo", 400000, 600, "GPS avanzado, instrumentos de vuelo premium");
            }
            if(modelo == 3){ 
                return new Vehiculo("Helicoptero", "Aereo", "Lujo", 1200000, 280, "Cabina ejecutiva, aire acondicionado, turbina doble");
            }
        }
        
        return null; 
    }
}