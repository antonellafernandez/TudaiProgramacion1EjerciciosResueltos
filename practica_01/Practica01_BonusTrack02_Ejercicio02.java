package practica_01;

// Ejercicio 02: Dados los siguientes enunciados y códigos, analizar y detectar los errores. 
// Justificar en cada caso.

/*a) Suponiendo dos números enteros dados, se pide imprimir:
		i. si ambos son positivos y el primero es múltiplo de 5 y el segundo múltiplo de 7.
		ii. si el primero es mayor a 3 veces el segundo o es múltiplo del segundo.
		iii. si el primero es menor al segundo y la suma es par.
	
public class Practica01_BonusTrack02_Ejercicio02 {
	public static void main(String[] args){

		int num_1 = 34, num_2 = 67; // Valores de ejemplo
		
		boolean resultado_1, resultado_2, resultado_3;
		
		resultado_1 = (num_1 > 0 && num_2 > 0) && (num_1 % 5 == 0) && (num_2 % 7 == 0);
		resultado_2 = (num_1 > (num_2 * 3)) || (num_1 % num_2 == 0);
		resultado_3 = (num_1 < num_2) && ((num_1 + num_2) % 2 == 0);

		System.out.println ("Inciso i: " + resultado_1);
		System.out.println ("Inciso ii: " + resultado_2);
		System.out.println ("Inciso iii: " + resultado_3);
	}
}
*/

// b) Suponiendo un número entero dado, se pide imprimir:
//		i. si el número está en un rango de 3 a 78, y si es múltiplo de 9 o de 7.
//		ii. si el número es menor a 65 pero como mínimo 24 y es impar.
//		iii. si el número es negativo o positivo e impar.

public class Practica01_BonusTrack02_Ejercicio02 {
	public static void main(String[] args){

		int num = 34; // Valor de ejemplo
		
		boolean resultado_1, resultado_2, resultado_3;
		
		resultado_1 = (3 < num && num < 78) && (num % 9 == 0 || num % 7 == 0);
		resultado_2 = (num < 65 && num > 23) && (num % 2 != 0);
		resultado_3 = (num < 0) || (num > 0 && num % 2 != 0);
		
		System.out.println ("Inciso i: " + resultado_1);
		System.out.println ("Inciso ii: " + resultado_2);
		System.out.println ("Inciso iii: " + resultado_3);
	}
}