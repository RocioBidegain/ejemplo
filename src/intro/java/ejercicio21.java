/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 * @author pochita
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int[] vector;
        System.out.println("ingrese la dimension del vector");
        int N = leer. nextInt();
        vector = new int [N];
         System.out.println("tu vector aleatorio quedo de esta manera");
        for (int i=0; i<N ; i++) {
            vector[i]= (int) (Math.random() * 10);
           System.out.print(vector[i] + ", ");
        }
        System.out.println("");
        System.out.println("ingrese un numero para buscar en el vector");
        int num = leer. nextInt();
        System.out.println("...buscando... la ubicacion en la que se encuentre será devuelta a continuacion");
        for (int j=0 ; j <N ; j++){
            if (vector[j] == num) {
                System.out.println(j);
            contador = contador+1;
            }
           
            }
         if (contador == 0){
                System.out.println("el numero no fue encontrado en ninguna ubicacion");
        }
    
        
        
        
        
        // TODO code application logic here
    }
    
}
