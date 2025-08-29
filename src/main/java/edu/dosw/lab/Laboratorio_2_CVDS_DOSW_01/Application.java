package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01;

import edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto6.Reto6Support;
import edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.comportamiento.reto7.Reto7MagicRemote;
import edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.solid.Reto1TiendaDonPepe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//Reto1TiendaDonPepe.ejecutar();
		//Reto6Support.ejecutar();
		//ApplicationReto3.ejecutar();
		Reto7MagicRemote.ejecutar();
	}

}
