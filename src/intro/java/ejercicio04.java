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
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("ingrese una cantidad de grados centigrados, el programa le devolvera su equivalente en grados fahrenheit");
        Scanner leer = new Scanner (System.in);
        int grados = leer. nextInt();
        System.out.println("usted ingresó " +  grados + "°C");
        int equivalente = (32 + (9 * grados / 5));
        System.out.println("el equivalente en Fahrenheit es " + equivalente + "°F");
        
        // TODO code application logic here
    }
    
}
