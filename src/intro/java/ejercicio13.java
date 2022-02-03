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
public class ejercicio13 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer. nextInt();
        int inicial=0;
        System.out.println("ingrese los valores a sumar");
        while (inicial<num){
       int valores = leer. nextInt();
        inicial=inicial+valores;
        }
            
        System.out.println( inicial + " has superado el valor inicial ya no puedes seguir sumando");
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
