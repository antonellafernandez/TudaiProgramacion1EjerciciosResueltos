package practica_03;

// Ejercicio 02: Dados los siguientes enunciados y códigos, analizar y detectar los errores. Justificar en cada caso.

// a. Escribir un programa que llame un método que calcule el promedio de la suma de valores 
// enteros entre 1 y 1000. Finalmente, el promedio debe mostrarse por pantalla.

/*
public class Practica03_BonusTrack02_Ejercicio02 {
	public static void main(String[] args) {
		calcularPromedio();
	}
	public static void calcularPromedio() {
		int MIN = 1;
		int MAX = 1000;
		
		int suma = 0;
		int contador = 0;
		
		for (int i = MIN; i <= MAX; i++) {
		suma += i;
		contador += 1;
		}
		
		int promedio = suma / contador;
		
		System.out.println("El promedio de la suma de valores enteros entre " + MIN + " y " + MAX);
		System.out.println(" es " + promedio);
	}
} 
*/

// b. Dados dos números positivos y un carácter opción cuyo valor es una letra minúscula ‘s’ o ‘r’ 
// (únicamente puede tomar estos dos valores), obtener la suma de ambos números si la opción es ‘s’ o si es ‘r’ 
// se debe restar el primero al segundo.

public class Practica03_BonusTrack02_Ejercicio02 {
	public static void main(String[] args) {
		int numero1 = 235; // valor de ejemplo
		int numero2 = -5; // valor de ejemplo
		char opcion = 's';
		
		resolver(numero1, numero2, opcion);
	}
	
	public static void resolver(int num1, int num2, char op){
		if (op == 's') {
			System.out.println("La suma es: " + (num1 + num2));
		} else if (op == 'r') {
			System.out.println("La resta es: " + (num2 - num1));
		} else {
			System.out.println("Opción no válida");
		}
	}
}