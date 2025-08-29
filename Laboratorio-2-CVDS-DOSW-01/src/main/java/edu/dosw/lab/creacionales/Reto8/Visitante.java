package edu.dosw.lab.creacionales.Reto8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitante {
    private String nombre;
    private int edad;
    private List<Animal> animalesFavoritos = new ArrayList<>();
    private Map<Cuidador, Double> propinas = new HashMap<>();
    private Map<Animal, List<String>> fotosAnimales = new HashMap<>();
    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void agregarAnimalFavorito(Animal animal) {
        if (!animalesFavoritos.contains(animal)) {
            animalesFavoritos.add(animal);
            System.out.println(nombre + " agregó a " + animal.getNombre() + " como animal favorito.");
        }
    }
    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " está alimentando a " + animal.getNombre());
        animal.alimentar();
    }
    public void darPropina(Cuidador cuidador, double monto) {
        propinas.put(cuidador, propinas.getOrDefault(cuidador, 0.0) + monto);
        System.out.println(nombre + " dio una propina de $" + monto + " a " + cuidador.getNombre());
    }
    public void subirFoto(Animal animal, String descripcionFoto) {
        fotosAnimales.computeIfAbsent(animal, k -> new ArrayList<>()).add(descripcionFoto);
        System.out.println(nombre + " subió una foto de " + animal.getNombre() + ": " + descripcionFoto);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public List<Animal> getAnimalesFavoritos() { return animalesFavoritos; }
    public Map<Cuidador, Double> getPropinas() { return propinas; }
    public Map<Animal, List<String>> getFotosAnimales() { return fotosAnimales; }
}