package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.ChainOfResponsability.Reto6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Tecnico basico = new TecnicoBasico();
        Tecnico intermedio = new TecnicoIntermedio();
        Tecnico avanzado = new TecnicoAvanzado();

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        List<Ticket> tickets = Arrays.asList(
                new Ticket("Problema con login", Nivel.BASICO, Prioridad.BAJA),
                new Ticket("Error crítico en instalación", Nivel.INTERMEDIO, Prioridad.ALTA),
                new Ticket("Caída del servidor", Nivel.AVANZADO, Prioridad.MEDIA),
                new Ticket("Problema de facturación", Nivel.BASICO, Prioridad.ALTA)
        );

        Map<String, Integer> resueltos = new HashMap<>();
        List<Integer> prioridadesResueltas = new ArrayList<>();
        int pendientes = 0;

        for (Ticket t : tickets) {
            boolean resuelto = basico.resolver(t);
            if (resuelto) {
                if (t.getNivel() == Nivel.BASICO && t.getPrioridad().getValor() <= 2)
                    resueltos.merge("Básico", 1, Integer::sum);
                else if (t.getNivel() == Nivel.INTERMEDIO)
                    resueltos.merge("Intermedio", 1, Integer::sum);
                else if (t.getNivel() == Nivel.AVANZADO)
                    resueltos.merge("Avanzado", 1, Integer::sum);

                prioridadesResueltas.add(t.getPrioridad().getValor());
            } else {
                pendientes++;
            }
        }

        System.out.println("--- Estadísticas ---");
        System.out.println("Tickets resueltos:");
        System.out.println("Básico: " + resueltos.getOrDefault("Básico", 0));
        System.out.println("Intermedio: " + resueltos.getOrDefault("Intermedio", 0));
        System.out.println("Avanzado: " + resueltos.getOrDefault("Avanzado", 0));
        System.out.println("Tickets pendientes: " + pendientes);

        double promedio = prioridadesResueltas.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println("Promedio de prioridad de tickets resueltos: " + promedio);
    }
}


