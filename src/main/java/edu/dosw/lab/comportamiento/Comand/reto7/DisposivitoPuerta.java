package edu.dosw.lab.comportamiento.Comand.reto7;

class DispositivoPuerta {
    private boolean abierta = false;

    public void abrir() {
        System.out.println("Puerta abierta");
        this.abierta = true;
    }

    public void cerrar() {
        System.out.println("Puerta cerrada");
        this.abierta = false;
    }

    public boolean isAbierta() {
        return abierta;
    }
}