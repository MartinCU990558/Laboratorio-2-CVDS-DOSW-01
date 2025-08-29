package edu.dosw.lab.Estructurales.Reto5;

import edu.dosw.lab.Util.ToppingInfo;

import java.util.*;

public class ToppingFactory {
    private List<ToppingInfo> catalogo = new ArrayList<>();

    public ToppingFactory() {
        catalogo.add(new ToppingInfo("Leche", 1000));
        catalogo.add(new ToppingInfo("Chocolate", 1500));
        catalogo.add(new ToppingInfo("Caramelo", 1200));
        catalogo.add(new ToppingInfo("Crema Batida", 2000));
        catalogo.add(new ToppingInfo("Menta", 1700));
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i+1) + ". " + catalogo.get(i));
        }
        System.out.println((catalogo.size()+1) + ". Agregar topping personalizado");
    }

    public Topping crearTopping(Coffee base, int option, Scanner sc) {
        if (option >= 1 && option <= catalogo.size()) {
            return new Topping(base, catalogo.get(option-1));
        } else if (option == catalogo.size()+1) {
            System.out.print("Ingrese nombre del nuevo topping: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese precio del nuevo topping: ");
            int precio = sc.nextInt(); sc.nextLine();
            ToppingInfo nuevo = new ToppingInfo(nombre, precio);
            catalogo.add(nuevo);
            return new Topping(base, nuevo);
        }
        return null;
    }
}
