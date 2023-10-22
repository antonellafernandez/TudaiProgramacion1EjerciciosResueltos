package practica_01;

// 4. Escribir un programa que permita ingresar 5 números de a uno por vez 
// y que los muestre por pantalla en orden inverso:
// Ejemplo: Ingreso: 23, 4, 2, 100, 3
// Se debe mostrar: 3, 100, 2, 4, 23

import java.util.Scanner;

public class Practica01_Ejercicio04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[5];
		
		System.out.println("Ingrese cinco números enteros, de a uno por vez: ");
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		
		System.out.println("Los números en orden inverso son: ");
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i] + " ");
		}
		
		input.close();
		
	}
}
