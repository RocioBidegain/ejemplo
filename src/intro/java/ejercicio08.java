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
public class ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase ;
        String eureka = "eureka";
        System.out.println("ingrese la palabra Eureka");
                frase = leer. nextLine();
        boolean soniguales = frase.equalsIgnoreCase(eureka);
        
        if (soniguales) {
        System.out.println("has escrito la palabra correcta");
        } else {
            System.out.println("esa no fue la palabra que pedimos");
     
    }
                
        // TODO code application logic here
    }
    
}
