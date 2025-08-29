package edu.dosw.lab.creacionales.Reto2;
import java.util.Scanner;

import edu.dosw.lab.creacionales.Reto2.Ingredientes.*;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Pedido {
    private ArrayList<Ingrediente> ingredientes_disponibles;
    private ArrayList<Ingrediente> ingredientes_pedidos;
    private Cocina cocina;

    public Pedido(Cocina cocina) {
        this.cocina = cocina;
        this.ingredientes_disponibles = this.cocina.getIngredientes_disponibles();
        this.ingredientes_pedidos = new ArrayList<>();
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
        System.out.print("Ingresa el nuevo valor (Double->0,0): ");
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

    public ArrayList<Ingrediente> obtenerPedido(){
        return ingredientes_pedidos;
    }




}
