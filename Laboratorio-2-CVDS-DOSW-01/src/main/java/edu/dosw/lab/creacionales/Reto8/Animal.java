package edu.dosw.lab.creacionales.Reto8;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    public String nombre;
    public int edad;
    public String sonidoCaracteristico;
    public String dieta;
    private String alimentoPreferido;
    public double peso;
    public double altura;
    public EstadoSalud estadoSalud;
    public String habitat;
    private Map<String, String> atributosDinamicos = new HashMap<>();

    public Animal(String nombre, int edad, String sonidoCaracteristico, String dieta,
                  String alimentoPreferido, double peso, double altura, EstadoSalud estadoSalud, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.sonidoCaracteristico = sonidoCaracteristico;
        this.dieta = dieta;
        this.alimentoPreferido = alimentoPreferido;
        this.peso = peso;
        this.altura = altura;
        this.estadoSalud = estadoSalud;
        this.habitat = habitat;
    }

    public abstract void hacerSonido();

    public void alimentar() {
        System.out.println(nombre + " está siendo alimentado con " + alimentoPreferido);
    }

    public void banar() {
        System.out.println(nombre + " está siendo bañado.");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setAtributoDinamico(String clave, String valor) {
        atributosDinamicos.put(clave, valor);
    }
    public String getAtributoDinamico(String clave) {
        return atributosDinamicos.get(clave);
    }

    public void limpiarHabitat() {
        System.out.println("Limpiando el hábitat de " + nombre);
    }
}