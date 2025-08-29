package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.ChainOfResponsability.Reto6;

public abstract class TecnicoBase implements Tecnico {
    protected Tecnico siguiente;
    protected Nivel nivel;
    protected Prioridad prioridadMaxima;
    protected String nombre;

    public TecnicoBase(String nombre, Nivel nivel, Prioridad prioridadMaxima) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.prioridadMaxima = prioridadMaxima;
    }

    @Override
    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean resolver(Ticket ticket) {
        if (ticket.getNivel() == nivel && ticket.getPrioridad().getValor() <= prioridadMaxima.getValor()) {
            System.out.println(ticket);
            System.out.println(nombre + " resolvió el problema.\n");
            return true;
        } else {
            if (siguiente != null) {
                System.out.println(ticket);
                System.out.println(nombre + " no pudo resolver. Pasando al siguiente...\n");
                return siguiente.resolver(ticket);
            } else {
                System.out.println(ticket);
                System.out.println(" Ningún técnico disponible. Ticket pendiente de escalamiento.\n");
                return false;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}

