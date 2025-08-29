package edu.dosw.lab.comportamiento.Reto4;

import edu.dosw.lab.comportamiento.Reto4.Monedas.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CasaDeCambio {
    private Conversor conversor;
    private ConvertirStringMoneda cSm;

    public CasaDeCambio() {
        conversor = new Conversor();
        cSm = new ConvertirStringMoneda();
    }


    private HashMap<String, BigDecimal> cambio(String[] monedas,String origen, double valor) {
            HashMap<String,BigDecimal> cambio = new HashMap<>();
            Moneda origenMoneda = cSm.convertirMoneda(origen);
            BigDecimal monto = BigDecimal.valueOf(valor);
            for(String moneda : monedas){
                Moneda m = cSm.convertirMoneda(moneda);
                if(m != null){
                    cambio.put(moneda,conversor.convertir(monto,origenMoneda,m));
                }
            }
            return cambio;
    }

    private HashMap<String, BigDecimal> pasarTotal(ArrayList<HashMap<String, BigDecimal>> lista){
        HashMap<String, BigDecimal> pasar = new HashMap<>();
        for (HashMap<String, BigDecimal> h : lista) {
            for (Map.Entry<String, BigDecimal> entry : h.entrySet()) {
                String clave = entry.getKey();
                BigDecimal valor = entry.getValue();
                if (pasar.containsKey(clave)) {
                    BigDecimal suma = pasar.get(clave).add(valor);
                    pasar.put(clave, suma);
                } else {
                    pasar.put(clave, valor);
                }
            }
        }

        return pasar;
    }


    private void totalFinal(HashMap<String, BigDecimal> pasar){
        System.out.println("====Total Por Moneda====");
        for (Map.Entry<String, BigDecimal> entry : pasar.entrySet()) {
            String clave = entry.getKey();
            BigDecimal valor = entry.getValue();
            System.out.println(clave + ": " + valor);
        }



    }

    public static void ejecutar() {
        Scanner s = new Scanner(System.in);
        CasaDeCambio c = new CasaDeCambio();
        System.out.println("Ingrese el numero de transacciones:");
        int transacciones = s.nextInt();
        ArrayList<HashMap<String, BigDecimal>> total = new ArrayList<>();

        for (int i = 0; i < transacciones; i++) {
            ArrayList<String[]>  totalMonedas = new ArrayList<>();
            System.out.println("======Transaccion " + (i+1) + "======");
            System.out.println("Ingrese monto");
            double monto = s.nextDouble();
            s.nextLine();

            System.out.println("Ingrese Moneda de origen(EUR,USD,COP,YEN)");
            String monedaOrigen = s.nextLine().trim();

            System.out.println("Ingrese Monede de destino(EUR,USD,COP,YEN), separado por comas");
            String monedasDestinoInput = s.nextLine().trim();

            String[] monedasEscogidas= monedasDestinoInput.split(",");
            totalMonedas.add(monedasEscogidas);

            total.add(c.cambio(monedasEscogidas,monedaOrigen,monto));
        }
        c.totalFinal(c.pasarTotal(total));


    }
}
