/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package intro.java;

import java.util.Scanner;
import sun.awt.X11.XConstants;

/**
 *
 * @author pochita
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
     System.out.println("ingrese la cantidad de euros a convertir");
     int euros = leer. nextInt();
     System.out.println(" ingrese la modena de cambio");
     String moneda, libras, dolar, yenes ;
     moneda = leer. next();
     cambio(euros, moneda)   ;
        
        
        
        // TODO code application logic here
    }
    public static void cambio(int euros, String moneda){
   double divisas;
      System.out.println("entre");
   if ( null == moneda){
       System.out.println("la divisa ingresada es incorrecta");
   } else switch (moneda) {
            case "libras":
                divisas = (double) (euros * 0.86);
                System.out.println("el cambio en libras es igual a " + divisas  + " libras");
                break;
            case "dolar":
                divisas = (double) (euros * 1.28611);
                System.out.println("el cambio en dolares es igual a " + divisas + " dolares");
                break;
            case "yenes":
                divisas = (double) (euros * 129.852);
                System.out.println("el cambio es yenes es igual a " + divisas + " yenes");
                break;
            default:
                System.out.println("la divisa ingresada es incorrecta");
                break;
        }
}

  
    }
