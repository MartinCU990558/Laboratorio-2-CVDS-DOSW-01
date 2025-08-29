package edu.dosw.lab.comportamiento.Comand.reto7;

class DispositivoLuz {
    private boolean encendida = false;

    public void encender() {
        System.out.println("Luz encendida");
        this.encendida = true;
    }

    public void apagar() {
        System.out.println("Luz apagada");
        this.encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }
}
