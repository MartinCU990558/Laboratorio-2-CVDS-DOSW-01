package edu.dosw.lab.creacionales.reto2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Constructor{
    Scanner sc = new Scanner(System.in);
    String respuesta;
    private List<Integer> numeros;
    public List<Ingrediente> ingredientesDisponibles = new ArrayList<>();
    Hamburguesa hamburguesa;
    public Constructor() {
        ingredientesDisponibles.add(new Ingrediente("Pan integral", 3.000));
        ingredientesDisponibles.add(new Ingrediente("Carne de res", 10.000));
        ingredientesDisponibles.add(new Ingrediente("Queso cheddar", 5.000));
        ingredientesDisponibles.add(new Ingrediente("Lechuga", 2.000));
        ingredientesDisponibles.add(new Ingrediente("Tomate", 2.000));
        ingredientesDisponibles.add(new Ingrediente("Salsa especial", 5.000));
    }

    public void presentacion() {
        System.out.println("Seleccione ingredientes para su hamburguesa");
        System.out.println("1. Pan ($3.000)");
        System.out.println("2. Carne ($10.000)");
        System.out.println("3. Queso ($5.000)");
        System.out.println("4. Lechuga ($2.000)");
        System.out.println("5. Tomate ($2.000)");
        System.out.println("6. Salsa especial ($5.000)");
        System.out.println("7. Agregar un nuevo ingrediente");
        System.out.println("Ingrese los numeros separados por coma:");
        this.respuesta = sc.nextLine();
        confirmarRespuesta();
        buildearHamburguesa();
    }


    public void confirmarRespuesta(){
        this.numeros = Arrays.stream(respuesta.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    public void buildearHamburguesa() {
        Hamburguesa.Builder builder = new Hamburguesa.Builder();
        numeros.stream()
                .forEach(num -> {
                    if (num >= 1 && num <= 6) {
                        ingredientesDisponibles.stream()
                                .filter(ingrediente -> ingrediente.getNombre().equals(
                                        ingredientesDisponibles.get(num - 1).getNombre()))
                                .findFirst()
                                .ifPresent(builder::agregarIngrediente);
                    } else if (num == 7) {
                        System.out.println("Ingrese el nombre del nuevo ingrediente");
                        String extraIngrediente = sc.nextLine();
                        System.out.println("Ingrese el precio del ingrediente");
                        double extraPrecio = Double.parseDouble(sc.nextLine());
                        builder.agregarIngrediente(new Ingrediente(extraIngrediente, extraPrecio));
                    }
                });

        hamburguesa = builder.build();
        System.out.println(hamburguesa);
    }
}
