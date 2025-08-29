package edu.dosw.lab.comportamiento.Comand.reto7;

class DispositivoMusica {
    private boolean reproduciendo = false;

    public void reproducir() {
        System.out.println("Música reproducida");
        this.reproduciendo = true;
    }

    public void detener() {
        System.out.println("Música detenida");
        this.reproduciendo = false;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }
}