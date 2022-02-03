/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;
/**
 *
 * @author pochita
 */
public class ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese dos numeros");
       int num1 = leer. nextInt();
       int  num2 = leer. nextInt();
       int mayor = (int) max(num1 , num2);
       int menor = (int) min(num1 , num2);
      System.out.println("el valor maximo es " + mayor);
      System.out.println("el valor minimo es " + menor);
      
        
        
        // TODO code application logic here
    }
    
}
