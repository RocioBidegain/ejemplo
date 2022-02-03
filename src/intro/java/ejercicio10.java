/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author pochita
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra que comience con A");
        String frase ;
                frase = leer. nextLine();
            String subcadena = frase.substring(0,1);
            System.out.println(subcadena);
         if  ("a".equals(subcadena)) {
            System.out.println("CORRECTO");
        } else { 
            System.out.println("INCORRECTO");
        }
        // TODO code application logic here
    }
    
}
