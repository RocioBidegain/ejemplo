/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;
import java.util.Scanner;

/**
 *
 * @author pochita
 */
public class ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra o frase de 8 caracteres");
        String frase ;
                frase = leer. nextLine();
         int larg = frase.length();    
         if (larg==8) {
            System.out.println("CORRECTO");
         } else { 
            System.out.println("INCORRECTO");
        }
        // TODO code application logic here
    }
    
}
