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
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese dos numeros por teclado");
        int num1= leer. nextInt();
        int num2 = leer. nextInt();
        int suma = num1 + num2 ;
        System.out.println("la suma de los numeros ingresados es " + suma );
        
        
        // TODO code application logic here
    }
    
}
