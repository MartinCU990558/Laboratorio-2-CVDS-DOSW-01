package edu.dosw.lab.Comportamiento.Reto7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ControlRemoto {
    private List<Command> historial = new ArrayList<>();
    private List<String> reportes = new ArrayList<>();

    public void ejecutarAccion(Command comando, boolean deshacer) {

        String reporte = "Acción " + (historial.size() + 1) + " ejecutada por "
                + comando.getUsuario() + ": " + comando.getDescripcion();
        reportes.add(reporte);

        comando.execute();

        if (deshacer) {
            comando.undo();
            comando.marcarDeshecha();
            String reporteUndo = "Acción " + (historial.size() + 1) + " deshecha: " + comando.getUndoDescripcion();
            reportes.add(reporteUndo);
        }

        historial.add(comando);
    }

    public void mostrarHistorial() {

        for (String r : reportes) {
            System.out.println(r);
        }

    
        System.out.println("\n---- Historial completo ----");
        int i = 1;
        for (Command c : historial) {
            String estado = c.fueDeshecha() ? " (deshecha)" : "";
            System.out.println(i + ": " + c.getDescripcion() + " - Usuario: " + c.getUsuario() + estado);
            i++;
        }
    }

    public void investigar() {
        System.out.println("\n---- Investigando quién desconfiguró los electrodomésticos ----");
        Map<String, Integer> contador = new HashMap<>();
        for (Command c : historial) {
            contador.put(c.getUsuario(), contador.getOrDefault(c.getUsuario(), 0) + 1);
        }

        for (String usuario : contador.keySet()) {
            int acciones = contador.get(usuario);
            if (acciones > 1) {
                System.out.println("Se detecta que " + usuario + " realizó " + acciones + " acciones que alteraron la configuración.");
            } else {
                System.out.println(usuario + " realizó " + acciones + " acción.");
            }
        }
    }
}
