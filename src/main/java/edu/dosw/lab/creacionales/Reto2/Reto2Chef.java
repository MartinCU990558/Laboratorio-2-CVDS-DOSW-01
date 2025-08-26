package edu.dosw.lab.creacionales.Reto2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Reto2Chef {
    private Cocina cocina;

    public Reto2Chef() {
        cocina = new Cocina();
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void cocinarChef(){
        this.cocina.cocinar();
    }



    public static void ejecutarPedido(){
        Reto2Chef c = new Reto2Chef();
        Pedido p = new Pedido(c.getCocina());



        Scanner sc = new Scanner(System.in);
        ArrayList<Ingrediente> s = p.getIngredientes_disponibles();
        System.out.println("Seleccione Los Ingredientes");
        IntStream.range(0, s.size())
                .forEach(i -> System.out.println(i+1 + ": " + s.get(i).getNombre() + "(" + s.get(i).getPrecio() + ")"));
        System.out.println("7: Agregar nuevo Ingrediente" );
        System.out.print("Ingresa números separados por coma: ");
        String input = sc.nextLine();
        String[] partes = input.split(",");
        p.agregarIngredientes(partes);
        System.out.println("--------------Hamburguesa--------");
        c.cocina.setCocina(p);
        c.cocina.cocinar();
        Hamburguesa h = c.cocina.getHamburguesa();

        System.out.println(h.toString());
        System.out.println("Precio: " + h.getPrecio());
        System.out.println("------------------------------");
        System.out.println("Disfrute");
    }


}
