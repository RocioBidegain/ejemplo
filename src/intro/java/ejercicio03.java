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
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ingrese una linea de texto");
        Scanner leer = new Scanner (System.in);
        String frase;
        frase = leer.nextLine();
        String mayusculas = frase.toUpperCase();
        String minusculas;
        minusculas = frase.toLowerCase();
        System.out.println("su texto expresado en mayusculas queda asi " + mayusculas );
        System.out.println("su texto escrito en minusculas queda asi " + minusculas );
        
        // TODO code application logic here
    }
    
}