package practica_03;

// Ejercicio 01: Dados los siguientes códigos, analizar y detectar los errores. Justificar en cada caso.

/* a.
public class Practica03_BonusTrack02_Ejercicio01 {
	public static void main(String[] args) {
		imprimirTabla5();
	}
	
	public static void imprimirTabla5(){
			for (int i = 1 ; i <= 10; i++) {
				System.out.println(5 * i);
			}
	}
} */

/* b.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica03_BonusTrack02_Ejercicio01 {
	public static void main(String[] args){
		char letra = obtenerCaracter();
		
		if (letra >= 'a' && letra <= 'z') {
			System.out.println("Es una letra minúscula");
		} else if (letra >= 'A' && letra <= 'Z') {
			System.out.println("Es una letra mayúscula");
		}
}
	public static char obtenerCaracter() {
		char letra = 'a';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Ingrese un NRO entero de 65 a 90 o de 97 a 122: ");
			int num = Integer.valueOf(entrada.readLine());

			if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
	            letra = (char) num;
	            System.out.println("El caracter ASCII correspondiente es: " + letra);
	        } else {
	            System.out.println("El número ingresado está fuera de rango.");
	        }
		} catch (Exception exc) {
			System.out.println("error");
		}
		
		return letra;
	}
} */

// c.
public class Practica03_BonusTrack02_Ejercicio01 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 7;
		
		System.out.println (a + ", " + b);
		System.out.println (a + ", " + b + ", " + c);
		
		a = 5;
		b = 2;

		System.out.println (a + ", " + b);
		System.out.println (a + ", " + b + ", " + c);
	}
}