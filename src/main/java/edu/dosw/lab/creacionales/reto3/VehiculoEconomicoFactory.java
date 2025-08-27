package edu.dosw.lab.creacionales.reto3;

public class VehiculoEconomicoFactory extends VehiculoAbstractFactory {
    
    @Override
    public Vehiculo crearVehiculo(int tipo, int modelo) {
        if(tipo == 1){
            if(modelo == 1){ 
                return new Vehiculo("Auto", "Terrestre", "Economico", 150, 120, "Radio básico");
            }
            if(modelo == 2){ 
                return new Vehiculo("Bicicleta", "Terrestre", "Economico", 20, 25, "Cambios básicos");
            }
            if(modelo == 3){
                return new Vehiculo("Moto", "Terrestre", "Economico", 120, 80, "Motor básico");
            }
        }

        if(tipo == 2){ 
            if(modelo == 1){ 
                return new Vehiculo("Lancha", "Acuatico", "Economico", 2500, 60, "Motor básico");
            }
            if(modelo == 2){ 
                return new Vehiculo("Velero", "Acuatico", "Economico", 350, 45, "Vela estándar");
            }
            if(modelo == 3){
                return new Vehiculo("Jet Ski", "Acuatico", "Economico", 80, 70, "Motor 2T");
            }
        }

        if(tipo == 3){ 
            if(modelo == 1){
                return new Vehiculo("Avion", "Aereo", "Economico", 150000, 500, "Monomotor");
            }
            if(modelo == 2){ 
                return new Vehiculo("Avioneta", "Aereo", "Economico", 80000, 300, "Motor Cessna");
            }
            if(modelo == 3){ 
                return new Vehiculo("Helicoptero", "Aereo", "Economico", 200000, 180, "Rotor simple");
            }
        }
        
        return null; 
    }
}
