package edu.dosw.lab.Laboratorio_2_CVDS_DOSW_01.Command.Reto7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ControlRemoto {
    private final Deque<Comando> pilaDeshacer = new ArrayDeque<>();
    private final List<Comando> historial = new ArrayList<>();

    public void ejecutar(Comando comando){
        comando.ejecutar();
        pilaDeshacer.push(comando);
        historial.add(comando);
    }

    public void deshacerUltima(){
        if(pilaDeshacer.isEmpty()){
            System.out.println("No hay acciones para deshacer.");
            return;
        }
        Comando ultimo = pilaDeshacer.pop();
        ultimo.deshacer();
        if (ultimo instanceof ComandoBase) {
            ((ComandoBase) ultimo).marcarDeshecha();
        }
    }

    public List<Comando> getHistorial(){
        return Collections.unmodifiableList(historial);
    }
}
