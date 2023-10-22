package practica_04;

// Ejercicio 04: Para los siguientes métodos verificar su funcionamiento por medio de algunas de las 
// técnicas aprendidas y corregir los errores si hubiesen:
	
public class Practica04_Ejercicio04 {
	public static void main(String[] args) {

		int num1 = 18;
		int num2 = 2;
		int num3 = 0;
		// a. System.out.println("El factorial de " + num1 + " es " + obtenerFactorial(num1));
		
		// b. System.out.println("La suma de los primeros " + num1 + " números naturales es " + obtenerSumatoria(num1));
		
		// c. System.out.println("Es " + esPrimo(num1) + " que " + num1 + " es primo");
		
		// d. System.out.println("El mayor de los tres números (" + num1 + ", " + num2 + ", " + num3 + ") es " + buscarMayor(num1, num2, num3));
		
		// e. System.out.println("El número " + num1 + " tiene " + contarDigitos(num1) + " dígitos");
		
		// f. System.out.println("Es " + buscarDigito(num1, num2) + " que " + num2 + " se encuentra en " + num1);
		
		// g. System.out.println("El divisor común máximo de " + num1 + " y " + num2 + " es " + divisorComunMaximo(num1, num2));
		
		System.out.println("El número " + num1 + " en binario es " + decimalABinario(num1));
	}
	
/* a. obtiene el factorial de numero
	public static int obtenerFactorial(int numero) {
		int resultado = numero;
		while (numero > 1) {
			resultado *= --numero;
		}
		return resultado;
	} */

/* b. obtiene la sumatoria de los primeros n naturales
	public static int obtenerSumatoria(int natural) {
		int resultado = 0;
		while (natural > 0) {
			resultado += natural--;
		}
		return resultado;
	} */

/* c.devuelve si es primo el número o no
	public static boolean esPrimo(int numero) {
		boolean retorno = true;
		
		if (numero < 2) {
	        return false;
	    } else {
	    	for (int i = 2; i <= (numero / 2); i++) {
	    		if (numero % i == 0) {
	    			retorno = false;
	    		} else {
	    			retorno = true;
	    		}
	    	}
	    }
		return retorno;
	} /*

/* d. retorna el mayor de los 3 números
	public static int buscarMayor(int a, int b, int c) {
		int mayor = a;
		if (a >= b && a >= c) {
			mayor = a;
		} else if (b >= a && b >= c) {
			mayor = b;
		} else if (c >= a && c >= b) {
			mayor = c;
		}
		return mayor;
	} */

/* e. cuenta los dígitos de un número
	public static int contarDigitos(int n) {
		int contador = 0;
		if (n == 0) {
			contador = 1;
		} else {
			while (n != 0) {
				n /= 10;
				contador++;
			}
		}
		return contador;
	} */

/* f. determina si en num está presente un determinado
	public static boolean buscarDigito(int num, int digito) {
		boolean encontrado;
		int resto;
		do {
			resto = num % 10;
			if (resto == digito) {
				encontrado = true;
			} else {
				encontrado = false;
			}
			num = num / 10;
		} while ((num > 0) && (encontrado == false));
		return encontrado;
	} */

/* g. determina el divisor común máximo de dos números
	public static int divisorComunMaximo(int num1, int num2) {
		int dcm = 1;
		int divisor = 2;
		while (divisor <= num1 && divisor <= num2) {
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				dcm = divisor;
			}
			divisor++;
		}
		return dcm;
	} */

// h. convierte un número decimal a su representación
	public static int decimalABinario(int num) {
		int binario = 0;
		int resto, base = 1;
		while (num > 0) {
			resto = num % 2;
			binario += resto * base;
			base *= 10;
			num /= 2;
		}
		return binario;
	}
}
