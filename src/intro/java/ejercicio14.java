/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
 *
 * @author pochita
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"empty-statement", "UnusedAssignment"})
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1 = leer. nextInt();
        int num2 = leer. nextInt();
        int menu=0 ;
       
        while (menu<5) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("ELIJA OPCION");
         menu = leer. nextInt();   
        
                switch (menu) {
        case 1:
        System.out.println("la suma de los valores es " + (num1+num2));
        continue;
        case 2: 
        System.out.println("la resta de los valores es " + (num1-num2));
        continue;
        case 3:
        System.out.println("la multiplicacion de los valores es " + (num1*num2));
        continue;
        case 4: 
        System.out.println("la division de los valores es " + (num1/num2));
        continue;
        case 5:
        String decision;
       // decision = leer. nextLine();
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        decision = leer. next();
        if ("s".equals(decision)) {
                System.out.println(" hasta pronto");
                break;
            
        } else if  ("n".equals(decision)) {
            menu=0;
            continue;
      }
        default:
        System.out.println("el numero ingresado no es valido");
        
        }
        }


        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here


    
}
