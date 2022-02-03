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
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("intentaremos crear una matriz magica!!, la misma consta de ser cuadrada y la suma de sus valores en cada direccion suman lo mismo! vamos a intentarlo!!");
	int matriz[][], num, contadorhorizontal =0, contadordiagonala=0, contadordiagonalb=0, contadorvertical=0;
	boolean esmagia;
	esmagia= true;
	contadordiagonala=0;
	Scanner leer = new Scanner(System.in);	
	System.out.println("ingrese la dimension de la matriz, la misma no puede superar 10");
	num = leer. nextInt();
	matriz = new int [num][num];
	if (num>10){
		System.out.println( "la dimension de la matriz es mas grande de lo pedido");
        } else {
		System.out.println("vamos a ingresar los valores a nuestra matriz, recuerda que el valor debe estar entre 1 y 9");
        }
		for (int i=0 ; i<num ; i++) {
			for (int j=0 ; j<num ; j++){
				System.out.print("ingrese el valor de la posicion " + i +  "," + j);
				matriz[i][j] = leer. nextInt();
					if (matriz[i][j]>9 || matriz[i][j]<1){
						System.out.println("el valor no esta dentro de los parametros");
                                        }
                }
			
    }
		
		for (int i =0 ; i<num ; i++) {
			for (int j = 0 ; j < num ; j ++){
				System.out.print( matriz[i][j] + "  " );
                        }
			System.out.println("");
                }
		
		
		for (int i =0 ; i<num ; i++) {
                 for (int j =0 ; j<num ; j++) {
				contadorhorizontal=contadorhorizontal+matriz[i][j];
                 }
			System.out.println("en la linea horizontal con i valor " + i +" la suma vale "+ contadorhorizontal);
			contadordiagonala= contadordiagonala+matriz[i][i];
			
                }
		if ( contadorhorizontal != contadordiagonala ){
			esmagia = false;
                                }
	System.out.println(" la suma de la linea diagonal es igual a " + contadordiagonala);
		for (int j =0 ; j<num ; j++) {
			for (int i =0 ; i<num ; i++) {
				contadorvertical=contadorvertical+matriz[i][j];
                        }
			                 System.out.println(" la suma de los valores en la linea vertical de j " + j + " es igual a " + contadorvertical);
			contadordiagonalb= contadordiagonalb+matriz[j][j];
                }
		if (contadorvertical != contadordiagonalb){
			esmagia= false;
                                }
		System.out.println(" la suma de la linea diagonal es igual a " + contadordiagonalb);
		
		if (esmagia= true) {
		  System.out.println( "Es magia");
                } else { 
			System.out.println("No es magica");
                }
    

	
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
