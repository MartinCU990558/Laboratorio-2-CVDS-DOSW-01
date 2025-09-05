package edu.dosw.lab;

import edu.dosw.lab.Comportamiento.Reto7.Reto7;
import edu.dosw.lab.Comportamiento.reto6.Reto6;
import edu.dosw.lab.Creacionales.Reto2.Main;
import edu.dosw.lab.Creacionales.Reto3.Reto3;
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
		System.out.println("\n===== INICIO RETO 2 =====\n");
		Main.ejecutar();
		System.out.println("\n===== INICIO RETO 3 =====\n");
		Reto3.ejecutar();
		System.out.println("\n===== INICIO RETO 4 =====\n");
		Reto4.ejecutar();
		System.out.println("\n===== INICIO RETO 5 =====\n");
		Reto5.ejecutar();
		System.out.println("\n===== INICIO RETO 6 =====\n");
		Reto6.ejecutar();
		System.out.println("\n===== INICIO RETO 7 =====\n");
		Reto7.ejecutar();
	}

}