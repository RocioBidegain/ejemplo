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
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in) ;
       System.out.println("ingrese 4 valores");
       int num1 = leer. nextInt();
       int num2 = leer. nextInt();
       int num3 = leer. nextInt();
       int num4 = leer. nextInt();
       if (num1>= 1 && num1 <=20){
            System.out.print(num1);
           for (int i=0 ; i<num1 ; i++){
              
               System.out.print("*");
              
           }
              System.out.println(" ");  
       }
       if (num2>= 1 && num2 <=20){
           System.out.print(num2);
           for (int j=0 ; j<num2 ; j++){
               
               System.out.print("*");
           
           }
                   System.out.println(" ");
       }
        if (num3>= 1 && num3 <=20){
                System.out.print(num3);
           for (int k=0 ; k<num3 ; k++){
         
               System.out.print("*");
           
           }
                  System.out.println(" "); 
       }
       if (num4>= 1 && num4 <=20){
             System.out.print(num4);
           for (int l=0 ; l<num4 ; l++){
             
               System.out.print("*");
              
           }
              System.out.println(" ");  
       } 
        
        // TODO code application logic here
    }
    
}
