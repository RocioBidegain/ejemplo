/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author pochita
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);  
      System.out.println("ingrese un codigo de 5 caraceres");
      String codigo;
      int incorrecto= 0;
      int correcto = 0;
      boolean seacabo = true ;
      codigo = leer. nextLine();
      while (seacabo != codigo.equals("&&&&&")) {
      int larg = codigo.length();
      String inicial = codigo.substring(0,1);
      String fin = codigo.substring( larg-1, larg );
      if ((larg==5) && ("x".equals(inicial)) && ("o".equals(fin))){
          correcto = correcto+1;
          codigo = leer. nextLine();
      } else {
      incorrecto=incorrecto+1;
       codigo = leer. nextLine();
   }
     }
    
         
     System.out.println("la cantidad de codigos correctos fue de " + correcto );
     System.out.println("la cantidad de codigos incorrectos fue de " + incorrecto);   
      
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
