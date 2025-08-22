package edu.dosw.lab.creacionales.Reto2;
import java.util.Scanner;

import edu.dosw.lab.creacionales.Reto2.Ingredientes.*;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Pedido {
    private ArrayList<Ingrediente> ingredientes_disponibles;
    public ArrayList<Ingrediente> ingredientes_pedidos;

    public Pedido() {
        this.ingredientes_disponibles = new ArrayList<>();
        this.ingredientes_pedidos = new ArrayList<>();
        setIngredientesDisponibles();
    }

    private void setIngredientesDisponibles() {
        ingredientes_disponibles.add(new Carne());
        ingredientes_disponibles.add(new Lechuga());
        ingredientes_disponibles.add(new Pan());
        ingredientes_disponibles.add(new Queso());
        ingredientes_disponibles.add(new Salsa());
        ingredientes_disponibles.add(new Tomate());
    }

    public ArrayList<Ingrediente> getIngredientes_disponibles() {
        return ingredientes_disponibles;
    }

    public void agregarIngredientes(String[] partes) {
        ArrayList<Integer> opciones = obetenerElementos(partes);
        opciones.stream()
                .filter(t -> t >= 1 && t <= ingredientes_disponibles.size())
                .forEach(t -> {
                    Ingrediente i = ingredientes_disponibles.get(t - 1);
                    ingredientes_pedidos.add(i);
                });

        if(opciones.contains(7)){
            agregarNuevoIngrediente();
        }
    }

    public void agregarNuevoIngrediente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nuevo ingrediente: ");
        String nome = sc.nextLine();
        System.out.print("Ingresa el nuevo valor: ");
        double valor = sc.nextDouble();
        Nuevo n = new Nuevo(nome,valor);
        ingredientes_pedidos.add(n);
    }

    public ArrayList<Integer> obetenerElementos(String[] partes){
        ArrayList<Integer> elementos = new ArrayList<>();
        for (int i = 0; i < partes.length; i++) {
            elementos.add(Integer.parseInt(partes[i].trim()));
        }
        return elementos;

    }


    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Scanner sc = new Scanner(System.in);

        ArrayList<Ingrediente> s = pedido.getIngredientes_disponibles();

        System.out.println("Seleccione Los Ingredientes");
        IntStream.range(0, s.size())
                .forEach(i -> System.out.println(i+1 + ": " + s.get(i).getNombre() + "(" + s.get(i).getPrecio() + ")"));
        System.out.println("7: Agregar nuevo Ingrediente" );
        System.out.print("Ingresa números separados por coma: ");
        String input = sc.nextLine();
        String[] partes = input.split(",");

        pedido.agregarIngredientes(partes);
        System.out.println("--------------Hamburguesa--------");
        System.out.println("Ingredientes:");
        pedido.ingredientes_pedidos.forEach(p -> System.out.println(p.getNombre() + " " + p.getPrecio()));
        double total = pedido.ingredientes_pedidos
                .stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
        System.out.println("Precio: " + total);
        System.out.println("------------------------------");
        System.out.println("Disfrute");





    }

}
