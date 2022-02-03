/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz
 * @author pochita
 */
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int[][] matriz;
        matriz = new int [4][4];
         System.out.println("tu matriz aleatoria quedo de esta manera");
        for (int i=0; i<4 ; i++) {
            for (int j=0 ; j<4 ; j++){
        matriz[i][j]= (int) (Math.random() * 10);
           System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("la matriz transpuesta queda de esta manera");
        for (int j=0; j<4 ; j++) {
            for (int i=0 ; i<4 ; i++){
           System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
