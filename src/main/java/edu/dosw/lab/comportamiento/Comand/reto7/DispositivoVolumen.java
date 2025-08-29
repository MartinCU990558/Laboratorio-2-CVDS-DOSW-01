package edu.dosw.lab.comportamiento.Comand.reto7;

class DispositivoVolumen {
    private int volumen = 50; // Volumen inicial por defecto

    public void ajustarVolumen(int nuevoVolumen) {
        System.out.println("Volumen ajustado a " + nuevoVolumen + "%");
        this.volumen = nuevoVolumen;
    }

    public int getVolumen() {
        return volumen;
    }
}
