package edu.dosw.lab.estructurales;

import java.util.ArrayList;
import java.util.List;
public class Toppings {
    public static final topping LECHE = new listToppings("Leche", 1000);
    public static final topping CARAMELO = new listToppings("Caramelo", 1200);
    public static final topping CHOCOLATE = new listToppings("Chocolate", 1500);
    public static final topping CREMA_BATIDA = new listToppings("Crema batida", 1500);
    public static final topping MENTA = new listToppings("Menta", 1500);


    public static List<topping> obtenerTodos() {
        List<topping> lista = new ArrayList<>();
        lista.add(LECHE);
        lista.add(CARAMELO);
        lista.add(CHOCOLATE);
        lista.add(CREMA_BATIDA);
        lista.add(MENTA);
        return lista;
    }
    public static ArrayList<newtopping> toppingsExtras(){
        ArrayList<topping> lista2 = new ArrayList<>();
        lista2.add();
    }
}


