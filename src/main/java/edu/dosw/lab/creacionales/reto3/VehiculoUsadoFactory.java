package edu.dosw.lab.creacionales.reto3;

public class VehiculoUsadoFactory extends VehiculoAbstractFactory {
    
    @Override
    public Vehiculo crearVehiculo(int tipo, int modelo) {
        if(tipo == 1){ 
            if(modelo == 1){
                return new Vehiculo("Auto", "Terrestre", "Usado", 8000, 90, "Usado en buen estado, radio funcional");
            }
            if(modelo == 2){ 
                return new Vehiculo("Bicicleta", "Terrestre", "Usado", 80, 20, "Usada con mantenimiento reciente");
            }
            if(modelo == 3){ 
                return new Vehiculo("Moto", "Terrestre", "Usado", 1500, 60, "Motor 125cc revisado, placa al día");
            }
        }

        if(tipo == 2){ 
            if(modelo == 1){ 
                return new Vehiculo("Lancha", "Acuatico", "Usado", 12000, 45, "Motor revisado, casco en buen estado");
            }
            if(modelo == 2){ 
                return new Vehiculo("Velero", "Acuatico", "Usado", 20000, 35, "Velas reparadas, estructura sólida");
            }
            if(modelo == 3){ 
                return new Vehiculo("Jet Ski", "Acuatico", "Usado", 4000, 50, "Motor 2 tiempos mantenido");
            }
        }

        if(tipo == 3){ 
            if(modelo == 1){ 
                return new Vehiculo("Avion", "Aereo", "Usado", 100000, 400, "Motor revisado, certificado de vuelo vigente");
            }
            if(modelo == 2){ 
                return new Vehiculo("Avioneta", "Aereo", "Usado", 50000, 250, "Instrumentos básicos funcionando");
            }
            if(modelo == 3){ 
                return new Vehiculo("Helicoptero", "Aereo", "Usado", 150000, 150, "Rotor principal revisado");
            }
        }
        
        return null; 
    }
}
