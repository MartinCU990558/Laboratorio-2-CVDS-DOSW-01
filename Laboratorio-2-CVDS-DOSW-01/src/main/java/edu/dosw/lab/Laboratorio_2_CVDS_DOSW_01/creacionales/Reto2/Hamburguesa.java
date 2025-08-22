package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.creacionales.Reto2;

import java.util.ArrayList;
import java.util.HashMap;

public class Hamburguesa {
        private String pan;
    private String carne;
    private String queso;
    private String lechuga;
    private String tomate;
    private String salsaEspecial;
    private String ingredientesAdicionales;
    private int precio;

    private HashMap<String, Integer> ingredientes;

    public Hamburguesa(Builder builder) {
        this.pan = builder.pan;
        this.carne = builder.carne;
        this.queso = builder.queso;
        this.lechuga = builder.lechuga;
        this.tomate = builder.tomate;
        this.salsaEspecial = builder.salsaEspecial;
        this.precio = builder.precio;
        ingredientes = new HashMap<>();
    }

    public HashMap<String, Integer> addIngredientes(ArrayList<Integer> ingredientesCliente){
        ingredientesCliente.stream().forEach(ingrediente -> {
            switch (ingrediente) {
                case 1:
                    ingredientes.put("pan", 2000);
                    break;
                case 2:
                    ingredientes.put("carne", 5000);
                    break;
                case 3:
                    ingredientes.put("queso", 1000);
                    break;
                case 4:
                    ingredientes.put("lechuga", 500);
                    break;
                case 5:
                    ingredientes.put("tomate", 500);
                    break;
                case 6:
                    ingredientes.put("salsaEspecial", 1500);
                    break;
                case 7:
                    ingredientes.put("huevo", 800);
                    break;
                default:
                    throw new AssertionError();
            }
        });
        return null;
    }
    
}
