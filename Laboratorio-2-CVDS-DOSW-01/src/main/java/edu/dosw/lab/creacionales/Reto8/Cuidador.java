package edu.dosw.lab.creacionales.Reto8;


import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private String nombre;
    private int edad;
    private List<Class<? extends Animal>> especialidad;
    private List<Animal> animalesACargo = new ArrayList<>();
    public Cuidador(String nombre, int edad, List<Class<? extends Animal>> especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }
    public void asignarAnimal(Animal animal) {
        // Validar que el cuidador tenga especialidad para el tipo de animal
        boolean puedeCuidar = especialidad.stream()
                .anyMatch(clase -> clase.isInstance(animal));
        if (puedeCuidar) {
            animalesACargo.add(animal);
            System.out.println(nombre + " ahora cuida a " + animal.getNombre());
        } else {
            System.out.println(nombre + " no tiene especialidad para cuidar a " + animal.getNombre());
        }
    }
    public void alimentarAnimal(Animal animal) {
        if (animalesACargo.contains(animal)) {
            animal.alimentar();
        } else {
            System.out.println(nombre + " no está a cargo de " + animal.getNombre());
        }
    }

    public void banarAnimal(Animal animal) {
        if (animalesACargo.contains(animal)) {
            animal.banar();
        } else {
            System.out.println(nombre + " no está a cargo de " + animal.getNombre());
        }
    }
    public void limpiarHabitatAnimal(Animal animal) {
        if (animalesACargo.contains(animal)) {
            animal.limpiarHabitat();
        } else {
            System.out.println(nombre + " no está a cargo de " + animal.getNombre());
        }
    }
    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public List<Class<? extends Animal>> getEspecialidad() { return especialidad; }
    public void setEspecialidad(List<Class<? extends Animal>> especialidad) { this.especialidad = especialidad; }
    public List<Animal> getAnimalesACargo() { return animalesACargo; }
}