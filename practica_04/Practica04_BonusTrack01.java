package practica_04;

// Ejercicio 01: Un comercio de la ciudad, que realiza horario de corrido de 8:30hs a 19hs, 
// necesita un programa que responda si está abierto o cerrado cuando un usuario/cliente ingresa una hora 
// determinada (hora yminutos).
	
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica04_BonusTrack01 {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int horaApertura = 8; // hora de apertura
		int minutoApertura = 30; // minuto de apertura
		int horaCierre = 19; // hora de cierre
		int minutoCierre = 0; // minuto de cierre
		
		int hh, mm;
		
		try {
			System.out.println("Ingrese hora (hh): ");
			hh = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese minutos (mm): ");
			mm = Integer.valueOf(entrada.readLine());

			// Comprobamos si la hora ingresada está dentro del horario de apertura y cierre
			if ((hh > horaApertura && hh < horaCierre) || (hh == horaApertura && mm >= minutoApertura) || (hh == horaCierre && mm < minutoCierre)) {
				System.out.println("El comercio está abierto.");
			} else {
				System.out.println("El comercio está cerrado.");
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}