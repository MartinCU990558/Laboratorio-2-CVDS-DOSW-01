package edu.dosw.lab;

import edu.dosw.lab.Estructurales.Reto5.Reto5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.dosw.lab.Comportamiento.Reto4.Reto4;
import edu.dosw.lab.Solid.Reto1.Reto1;

@SpringBootApplication
public class Laboratorio2CvdsDosw01Application {

	public static void main(String[] args) {

		SpringApplication.run(Laboratorio2CvdsDosw01Application.class, args);
		System.out.println("\nProyecto Maven configurado y corriendo correctamente");
		System.out.println("\n===== INICIO RETO 1 =====\n");
		Reto1.ejecutar();
		System.out.println("\n===== INICIO RETO 5 =====\n");
		Reto5.ejecutar();
	}

}
