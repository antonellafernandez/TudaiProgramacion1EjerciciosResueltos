package practica_03;

// Ejercicio 06: Escribir un programa que mientras el usuario cargue desde teclado un carácter letra minúscula, 
// llame a un método que imprime por pantalla la tabla de multiplicar del 9.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_Ejercicio06 {
	public static void main(String[] args) {
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese un caracter: ");
			char c = entrada.readLine().charAt(0);
			
			if (Character.isLowerCase(c)) {
				imprimirTablaDel9();
			}
			
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			System.out.println("El programa ha finalizado.");
		}
	}
	
	public static void imprimirTablaDel9() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + 9 + " = " + (i * 9));
		}
	}
}