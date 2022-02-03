/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 * @author pochita
 */
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int contador = 0 ;
        
         System.out.println("esta es tu matriz");
        for (int i=0; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++){
           System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("la matriz transpuesta queda de esta manera");
        for (int j=0; j<3 ; j++) {
            for (int i=0 ; i<3 ; i++){
           System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
      for (int i=0; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++){
        if ((matriz[i][j]) * (-1)  == (matriz[j][i])){
            contador = contador + 1 ;
        } else if (matriz[i][j] == 0) {
         contador = contador + 1 ;
        }
            }  
      }
      if (contador == 9) {
          System.out.println("la matriz es anti simetrica");
      } else {
          System.out.println("la matriz no es anti simetrica");
      }
      
        // TODO code application logic here
    }
    
}
