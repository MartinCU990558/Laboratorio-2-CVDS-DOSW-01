import java.util.*;

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
