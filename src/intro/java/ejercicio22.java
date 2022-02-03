/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author pochita
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int unacifra = 0 , doscifras = 0 , trescifras = 0 , cuatrocifras = 0 , cincocifras = 0;
        int[] vector;
        System.out.println("ingrese la dimension del vector");
        int N = leer. nextInt();
        vector = new int [N];
         System.out.println("tu vector aleatorio quedo de esta manera");
        for (int i=0; i<N ; i++) {
            vector[i]= (int) (Math.random() * 99999);
           System.out.print(vector[i] + ", ");
        }
        System.out.println("");
        for (int j=0 ; j<N ; j++){
          if (vector[j]>=0 && vector[j]<=9){
              unacifra= unacifra + 1;
          } else if(vector[j]>=10 && vector[j]<=99){
              doscifras = doscifras + 1 ;
          } else if (vector[j]>=100 && vector[j]<=999){
              trescifras = trescifras + 1 ;
          } else if (vector[j]>=1000 && vector[j]<=9999){
              cuatrocifras = cuatrocifras + 1 ;
          } else if (vector[j]>=10000 && vector[j]<=99999){
              cincocifras= cincocifras + 1 ;
                    
          }
        }
       System.out.println("hay " + unacifra + " numeros de 1 digito") ;
      System.out.println("hay " + doscifras + " numeros de 2 digitos") ;
      System.out.println("hay " + trescifras + " numeros de 3 digitos") ;
      System.out.println("hay " + cuatrocifras + " numeros de 4 digitos") ;
      System.out.println("hay " + cincocifras + " numeros de 5 digitos") ;
        
           
        // TODO code application logic here
    }
    
}
