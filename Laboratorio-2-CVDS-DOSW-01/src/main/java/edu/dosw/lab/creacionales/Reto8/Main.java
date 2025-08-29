package edu.dosw.lab.creacionales.Reto8;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Crear animales
        Mamifero leon = new Mamifero("Simba", 5, "Rugido", "Carnívoro", "Carne", 190.5, 1.2, EstadoSalud.SANO, "Sabana");
        Reptil cocodrilo = new Reptil("Coco", 12, "Gruñido", "Carnívoro", "Peces", 500.0, 3.5, EstadoSalud.SANO, "Río");
        Ave loro = new Ave("Loro", 2, "Chirp", "Herbívoro", "Semillas", 0.5, 0.3, EstadoSalud.SANO, "Selva");
        // Agregar atributos dinámicos
        leon.setAtributoDinamico("ColorPelaje", "Dorado");
        leon.setAtributoDinamico("Origen", "África");
        cocodrilo.setAtributoDinamico("Rareza", "Común");
        loro.setAtributoDinamico("HistorialMedico", "Vacunado");
        // Crear cuidadores con especialidades
        Cuidador cuidador1 = new Cuidador("Ana", 30, Arrays.asList(Mamifero.class, Ave.class));
        Cuidador cuidador2 = new Cuidador("Luis", 45, Arrays.asList(Reptil.class));
        // Asignar animales a cuidadores
        cuidador1.asignarAnimal(leon);      // Ana cuida a Simba
        cuidador1.asignarAnimal(loro);      // Ana cuida a Loro
        cuidador2.asignarAnimal(cocodrilo); // Luis cuida a Coco
        // Crear visitante
        Visitante visitante = new Visitante("Carlos", 25);
        // Visitante agrega animales favoritos
        visitante.agregarAnimalFavorito(leon);
        visitante.agregarAnimalFavorito(loro);
        // Visitante alimenta animales
        visitante.alimentarAnimal(leon);
        visitante.alimentarAnimal(cocodrilo);
        // Visitante da propina a cuidadores
        visitante.darPropina(cuidador1, 20.0);
        visitante.darPropina(cuidador2, 15.0);

        // Visitante sube fotos
        visitante.subirFoto(leon, "Foto del león rugiendo");
        visitante.subirFoto(loro, "Foto del loro en la rama");
        // Cuidadores interactúan con animales
        cuidador1.alimentarAnimal(leon);
        cuidador1.banarAnimal(loro);
        cuidador2.limpiarHabitatAnimal(cocodrilo);
        // Animales hacen sonidos
        leon.hacerSonido();
        cocodrilo.hacerSonido();
        loro.hacerSonido();
    }
}
