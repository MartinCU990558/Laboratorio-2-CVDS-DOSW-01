package edu.dosw.lab.Comportamiento.reto6;

import java.util.List;

public class GestorTickets {
    private SoporteTecnico cadena;

    public GestorTickets() {
        SoporteTecnico basico = new Basico();
        SoporteTecnico intermedio = new Intermedio();
        SoporteTecnico avanzado = new Avanzado();

        basico.setSiguiente(intermedio);
        intermedio.setSiguiente(avanzado);

        this.cadena = basico;
    }

    public void procesarTickets(List<Ticket> tickets, Reporte reporte) {
        tickets.forEach(t -> cadena.resolver(t, reporte));
    }
}

