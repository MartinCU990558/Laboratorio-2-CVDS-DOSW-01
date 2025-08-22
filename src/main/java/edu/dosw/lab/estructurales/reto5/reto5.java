package edu.dosw.lab.estructurales.reto5;
import edu.dosw.lab.estructurales.reto5.Cafe;
import edu.dosw.lab.estructurales.reto5.Leche;
import edu.dosw.lab.estructurales.reto5.Caramelo;
import edu.dosw.lab.estructurales.reto5.Menta;
import edu.dosw.lab.estructurales.reto5.CremaBatida;
import java.util.*;

public class reto5{
    private factura factura;

    public void ejecutar() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese La Cantidad de Cafes A Personalizar");

        int cantidadCafes = scanner.nextInt();
        int contador = 0;

        while (contador < cantidadCafes){

            boolean masToppings = true;
            Cafe cafe = new Cafe();
            if (contador==0){
                factura=new factura(cafe);
            }
            

            System.out.println("Ingrese un numero para añadir su topping:" );
            System.out.println("1.Leche");
            System.out.println("2.Caramelo");
            System.out.println("3.Chocolate");
            System.out.println("4.Menta");
            System.out.println("5.CremaBatida");
            System.out.println("6.Total De Su Compra");

            while(masToppings){
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Leche");
                        Leche leche = new Leche(cafe);

                        break;
                    
                    case 2:
                        System.out.println("Caramelo");
                        Caramelo caramelo = new Caramelo(cafe);
                        break;

                    case 3:
                        Menta menta = new Menta(cafe);
                        break;
                    
                    case 4:
                        CremaBatida crema = new CremaBatida(cafe);
                        break;
                    
                    case 5:
                        masToppings = false;
                        factura.addCafe(cafe);
                        
                }
                

            }
        contador ++;
        }
        System.out.print("Total Actual A Pagar:" + " " + factura.getTotal());
        scanner.close();
    }

}



