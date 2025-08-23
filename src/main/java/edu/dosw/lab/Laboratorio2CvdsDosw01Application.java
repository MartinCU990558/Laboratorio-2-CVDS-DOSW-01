package edu.dosw.lab;

import edu.dosw.lab.Solid.Reto1.Reto1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laboratorio2CvdsDosw01Application {

	public static void main(String[] args) {

		SpringApplication.run(Laboratorio2CvdsDosw01Application.class, args);
		System.out.println("\nProyecto Maven configurado y corriendo correctamente");
		Reto1.ejecutar();
	}

}
