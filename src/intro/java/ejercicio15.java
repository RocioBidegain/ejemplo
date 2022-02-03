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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          System.out.println("ingrese 20 numero para sumar");
        Scanner leer = new Scanner(System.in);
        int suma = 0 ;
        int num;
      num = leer. nextInt();
        for (int i = 0; i < 20; i=i+1) {
             if (num==0){
                 System.out.println("Se capturo el numero 0");
                break;
             }
             while (num!=0){
            if (num>0){
         suma = suma+num;
         num = leer. nextInt();
         break;
            } else { 
                suma = suma+0 ;
                num= leer. nextInt();
                break;
                    }
        }
           
            }
           System.out.println("la suma de todos estos valores es " + suma );
         
  
        
        // TODO code application logic here
    }
    
}
