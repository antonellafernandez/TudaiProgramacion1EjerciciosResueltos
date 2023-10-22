package ejercicios_parcial;
¡VER!
public class EjerciciosTipoParcial_Ejercicio01 {
	public static final int MAX_A = 41;
	public static final int MAX_S = 20;
	public static final char SEPARADOR1 = ' ';
	public static final char SEPARADOR2 = ',';
	public static final char SEPARADOR3 = '.';
	public static void main(String[] args) {
		char[] arreglo_A = {' ', 'l', 'a', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ' ', 'a', ' ', 'l', 'a', ' ', 'v', 'u', 'e', 'l', 't', 'a', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'e', 's', 'q', 'u', 'i', 'n', 'a', '.'};
		char[] arreglo_S = {' ', 'a', ' ', 'l', 'o', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'l', 'a', 's'};
		int inicio = 0;
		int fin = -1;
		
		while (inicio < MAX_A) {
			inicio = buscarInicioA(arreglo_A, fin + 1);
			if (inicio < MAX_A) {
				fin = buscarFinA(arreglo_A, inicio);
				if (esStopword(arreglo_A, inicio, fin, arreglo_S)) {
					eliminarPalabra(arreglo_A, inicio, fin);
					fin = inicio;
				}
			}
		}
		mostrarArreglo(arreglo_A);
	}
	
	public static int buscarInicioA(char[] arreglo, int pos) {
		while (pos < MAX_A && (arreglo[pos] == SEPARADOR1 || arreglo[pos] == SEPARADOR2 || arreglo[pos] == SEPARADOR3)) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFinA(char[] arreglo, int pos) {
		 while (pos < MAX_A && (arreglo[pos] != SEPARADOR1 && arreglo[pos] != SEPARADOR2 && arreglo[pos] != SEPARADOR3)) {
			 pos++;
		 }
		 return pos - 1;
	}
	
	private static boolean esStopword(char[] arreglo_A, int ini, int fin, char[] arreglo_S) {
		int iniS = 0;
		int finS = -1;
		boolean laEncontre = false;
		
		while (iniS < MAX_S && !laEncontre) {
			iniS = buscarIniS(arreglo_S, finS + 1);
			if (iniS < MAX_S) {
				finS = buscarFinS(arreglo_S, iniS);
				if (sonIguales(arreglo_A, ini, fin, arreglo_S, iniS, finS)) {
					laEncontre = true;
				}
			}
		}
		return laEncontre;
	}
	
	private static boolean sonIguales(char[] arreglo_A, int ini, int fin, char[] arreglo_S, int iniS, int finS) {
		if (fin - ini + 1 == finS - iniS + 1) {
			while (ini <= fin && arreglo_A[ini] == arreglo_S[iniS]) {
				ini++;
				iniS++;
			}
			return ini > fin;
		} else {
			return false;
		}
	}

	private static int buscarIniS(char[] arreglo, int pos) {
		while (pos < MAX_S && arreglo[pos] == SEPARADOR1) {
			pos++;
		}
		return pos;
	}
	
	private static int buscarFinS(char[] arreglo, int pos) {
		while (pos < MAX_S && arreglo[pos] != SEPARADOR1) {
			pos++;
		}
		return pos - 1;
	}
	
	private static void eliminarPalabra(char[] arreglo_A, int ini, int fin) {
		 for (int i = ini ; i <= fin; i++) {
			 correrAIzquierda(arreglo_A, ini);
		 }
	}
		 
	private static void correrAIzquierda(char[] arreglo, int pos) {
		 for (int i = pos; i < MAX_A - 1; i++) {
			 arreglo[i] = arreglo[i + 1];
		 }
	}
	
	public static void mostrarArreglo(char[] arreglo) {
		for (int i = 0; i < MAX_A; i++) {
			if (i == 0) {
				System.out.print("|" + arreglo[i] + "|");
			} else { 
				System.out.print(arreglo[i] + "|");
			}
		}
	}
}