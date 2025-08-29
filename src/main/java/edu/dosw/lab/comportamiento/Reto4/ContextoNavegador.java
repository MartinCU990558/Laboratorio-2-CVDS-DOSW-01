package edu.dosw.lab.comportamiento.Reto4;

import java.util.List;

public class ContextoNavegador {
    private StrategyTasa strategyTasa;

    public StrategyTasa getStrategyTasa() {
        return strategyTasa;
    }

    public void setStrategyTasa(StrategyTasa strategyTasaNueva) {
        strategyTasa = strategyTasaNueva;
    }

    public double tasaReal(double monto, String destino) {
        return strategyTasa.tasaReal(monto, destino);
    }

}
