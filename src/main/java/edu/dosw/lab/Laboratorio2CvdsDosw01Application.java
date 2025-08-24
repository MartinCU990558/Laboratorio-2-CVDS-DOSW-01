package edu.dosw.lab;

import edu.dosw.lab.Creacionales.Reto3.Reto3;
import edu.dosw.lab.Solid.Reto1.Reto1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laboratorio2CvdsDosw01Application {

	public static void main(String[] args) {

		SpringApplication.run(Laboratorio2CvdsDosw01Application.class, args);
		System.out.println("\nProyecto Maven configurado y corriendo correctamente");

		System.out.println("\n--- Ejecutando Reto 1 ---");
		Reto1.ejecutar();

		//System.out.println("\n--- Ejecutando Reto 2 ---");
		//Reto2.ejecutar();

		System.out.println("\n--- Ejecutando Reto 3 ---");
		Reto3.ejecutar();
	}

}
