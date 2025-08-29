package edu.dosw.lab.comportamiento.Reto7;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class ControlRemoto {
    private Stack<Comando> historial;
    private Stack<Comando> comandosDeshechos;
    private List<Comando> accionesEjecutadas;
    private List<Comando> accionesDeshechas;

    public ControlRemoto() {
        historial = new Stack<>();
        comandosDeshechos = new Stack<>();
        accionesEjecutadas = new ArrayList<>();
        accionesDeshechas = new ArrayList<>();
    }

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.push(comando);
        accionesEjecutadas.add(comando);
        comandosDeshechos.clear();
        String descripcion = comando.getDescripcion();
        if (descripcion.contains("Ajustar volumen")) {
            descripcion = "Ajustar volumen a " + descripcion.replace("Ajustar volumen a ", "");
        }
        System.out.println("Acción " + accionesEjecutadas.size() + 
                         " ejecutada por " + comando.getUsuario() + 
                         ": " + descripcion);
    }

    public void deshacerUltimoComando() {
        if (!historial.isEmpty()) {
            Comando comando = historial.pop();
            comando.deshacer();
            comandosDeshechos.push(comando);
            accionesDeshechas.add(comando);
            String descripcionDeshecha = "";
            if (comando.getDescripcion().contains("Ajustar volumen")) {
                descripcionDeshecha = "Volumen restaurado";
            } else if (comando.getDescripcion().equals("Encender luz")) {
                descripcionDeshecha = "Luz apagada";
            } else if (comando.getDescripcion().equals("Abrir puerta")) {
                descripcionDeshecha = "Puerta cerrada";
            } else if (comando.getDescripcion().equals("Reproducir música")) {
                descripcionDeshecha = "Música detenida";
            }
            
            System.out.println("Acción " + accionesEjecutadas.size() + 
                             " deshecha: " + descripcionDeshecha);
        }
    }

    public List<Comando> getAccionesEjecutadas() {
        return accionesEjecutadas;
    }

    public List<Comando> getAccionesDeshechas() {
        return accionesDeshechas;
    }
}