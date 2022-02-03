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
public class ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numero por teclado");
        Scanner leer = new Scanner (System.in);
        int num = leer. nextInt();
        int doble = num*2;
        int triple =num*3;
        double raiz = Math.sqrt(num);
        System.out.println("el doble del numero ingresado es " + doble );
        System.out.println("eltriple de numero ingresado es " + triple );
        System.out.println("la raiz cuadrada del numero ingresado es " + raiz );
             
        
        // TODO code application logic here
    }
    
}
