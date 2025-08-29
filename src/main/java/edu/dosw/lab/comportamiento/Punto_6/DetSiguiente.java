package edu.dosw.lab.comportamiento.Punto_6;

public class DetSiguiente {
    private Tecnico basicos;
    private Tecnico intermedios;
    private Tecnico avanzados;

    public DetSiguiente() {
        basicos = new TecnicoBasico();
        intermedios = new TecnicoIntermedio();
        avanzados = new TecnicoAvanzado();
        basicos.tecnicoElegido(intermedios);
        intermedios.tecnicoElegido(avanzados);
    }

    public String procesarTicket(Ticket ticket) {
        switch (ticket.getDificultad()) {
            case basico:
                return basicos.resolverTicket(ticket);
            case intermedio:
                return intermedios.resolverTicket(ticket);
            case avanzado:
                return avanzados.resolverTicket(ticket);
            default:
                return "Error: dificultad desconocida.";
        }
    }
}
