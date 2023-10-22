package practica_03;

// Ejercicio 01: Escribir un diseño de programa que mientras que el usuario ingrese un número distinto de 0, 
// pida ingresar otro número y lo imprima.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio01 {
	public static void main(String[] args) {
		imprimirEnteros();
	}
	
	public static int imprimirEnteros() {
		int entero = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		 
		 try{
			 do {
				 System.out.println("Ingrese un número entero (0 para Salir): ");
				 entero = Integer.valueOf(entrada.readLine());
			 
				 if (entero == 0) {
					 System.out.println("El programa ha finalizado");
				 } else {
					 System.out.println("El número ingresado es " + entero);
				 }
			 } while (entero != 0);
		 }
		 
		 catch (Exception exc){
			 System.out.println("error" + exc);
		 }
		 
		 return entero;
	}
}