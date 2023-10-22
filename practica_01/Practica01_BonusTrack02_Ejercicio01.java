package practica_01;

// Ejercicio 01: Dados los siguientes códigos, analizar y detectar los errores.
// Justificar en cada caso.

/* a)
public class Practica01_BonusTrack02_Ejercicio01 {
	public static void main(String[] args) {
		
		double peso = 75.5;
		
		System.out.println("El valor del peso es: " + peso);
		
	}
}
*/

/* b)
public class Practica01_BonusTrack02_Ejercicio01{
	public static void main(String[] args) {


		int num_2 = 5;
		int num_1 = 10 + num_2;
		
		System.out.println("El valor de número uno es:" + num_1);
		System.out.println("El valor de número dos es:" + num_2);

	}
} 
*/

// c)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica01_BonusTrack02_Ejercicio01 {
	public static void main(String[] args) {

		int entero;

		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

			System.out.println("Ingrese un entero: ");
			entero = Integer.valueOf(entrada.readLine());
			System.out.println("Nro. ingresado: " + entero);
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
}