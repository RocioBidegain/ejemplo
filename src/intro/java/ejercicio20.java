/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;
/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 * @author pochita
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        for (int i = 0 ; i<100 ; i++) {
            vector[i]=i;
        }
     for (int j = 99 ; j >= 0 ; j--)  {
         System.out.print(vector[j] + ",");
     } 
        
        
        
        
        // TODO code application logic here
    }
    
}
