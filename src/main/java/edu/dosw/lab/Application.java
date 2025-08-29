package edu.dosw.lab;
import edu.dosw.lab.comportamiento.Reto6.SoporteTecnico;
import edu.dosw.lab.comportamiento.Reto7.ControlRemotoMagico;
import edu.dosw.lab.creacionales.Reto2.ChefDe5Estrellas;
import edu.dosw.lab.creacionales.Reto3.ReinoDeLosVehiculos;
import edu.dosw.lab.estructurales.Reto4.CasaDeCambio;
import edu.dosw.lab.estructurales.Reto5.ElCafePerzonalizado;
import edu.dosw.lab.solid.Reto1.Reto1TiendaDonPepe;
public class Application {
    public static void main(String[] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente.");
        Reto1TiendaDonPepe.ejecutar1();
        ChefDe5Estrellas.ejecutar2();
        ReinoDeLosVehiculos.ejecutar3();
        CasaDeCambio.ejecutar4();
        ElCafePerzonalizado.ejectutar5();
        SoporteTecnico.ejecutar6();
        ControlRemotoMagico.ejecutar7();

    }
}