package ejercicios_parcial;

/* Un dispositivo que lleva un animal bovino en su cuello recolecta datos de un acelerómetro en tres ejes: X Y Z.
Cada toma de datos se representa como una secuencia de valores enteros entre 0 y 1023 para cada eje, las
secuencias están separadas por -1 (valor no válido para esta lógica). El productor quiere conocer cómo se ha
comportado su animal en el transcurso del día y para ello ingresa un patrón de aceleración X Y Z y una cantidad
N de repeticiones. Un patrón que se repite una cierta cantidad de veces consecutivas significa que el animal
puede estar pastoreando, caminando, rumiando, etc. Dado un valor N y el patrón X Y Z en un arreglo inicializado
con -1 (de tamaño igual al arreglo que tiene los datos), hacer un programa en JAVA que:

Compruebe si el patrón se repitió N o más veces y si es así que elimine del arreglo las secuencias que se
siguen repitiendo consecutivamente luego de la cantidad N.

Por ejemplo, si tenemos el siguiente arreglo de datos:
-1 12 22 44 -1 23 34 55 -1 23 34 55 -1 23 34 55 -1 23 34 57 -1

El arreglo patrón X Y Z a analizar es X=23, Y=34, Z=55 y el N=2:
-1 -1 -1 -1 -1 -1 -1 -1 23 34 55 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

El arreglo resultante sería:
-1 12 22 44 -1 23 34 55 -1 23 34 55 -1 -1 23 34 57 -1 -1 -1 -1 */

public class EjerciciosTipoParcial_Ejercicio02 {
	public static final int MAX = 21, SEPARADOR = -1, N = 2;
	public static void main(String[] args) {
		int[] arreglo = {-1, 12, 22, 44, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1};
		int[] arregloPatron = {-1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int inicioPatron = 0, finPatron = -1;

		inicioPatron = buscarInicio(arregloPatron, finPatron + 1);
		finPatron = buscarFin(arregloPatron, inicioPatron);
		
		buscarRepeticiones(arreglo, arregloPatron, inicioPatron, finPatron);
		mostrarArreglo(arreglo);
	}
	
	public static int buscarInicio(int[]arreglo, int pos) {
		while (pos < MAX && arreglo[pos] == SEPARADOR) {
			pos++;
		}
		return pos;
	}
	
	public static int buscarFin(int[]arreglo, int pos) {
		while (pos < MAX && arreglo[pos] != SEPARADOR) {
			pos++;
		}
		return pos - 1;
	}
	
	public static void buscarRepeticiones(int[]arreglo, int[]arregloPatron, int inicioPatron, int finPatron) {
		int inicioArreglo = 0, finArreglo = -1, repeticiones = 0;
		
		while (inicioArreglo < MAX) {
			inicioArreglo = buscarInicio(arreglo, finArreglo + 1);
			if (inicioArreglo < MAX) {
				finArreglo = buscarFin(arreglo, inicioArreglo);
				
				if (finArreglo - inicioArreglo + 1 == finPatron - inicioPatron + 1 && cumplePatron(arreglo, inicioArreglo, finArreglo, arregloPatron, inicioPatron)) {
					repeticiones++;
					
					if (repeticiones > N) {
                        eliminarSecuencia(arreglo, inicioArreglo, finArreglo);
                        finArreglo = inicioArreglo;
                    }
                } else {
                    repeticiones = 0;
                }
			}
		}
	}
	
	private static boolean cumplePatron(int[] arreglo, int inicio, int fin, int[] arregloPatron, int inicioPatron) {
		while (inicio <= fin && arreglo[inicio] == arregloPatron[inicioPatron]) {
			inicio++;
			inicioPatron++;
		}
		return inicio > fin;
	}
	
	private static void eliminarSecuencia(int[] arreglo, int inicio, int fin) {
		for (int i = inicio ; i <= fin; i++) {
			corrimientoIzquierda(arreglo, inicio);
		}
	}
	
	private static void corrimientoIzquierda(int[] arreglo, int pos) {
		for (int i = pos; i < MAX - 1; i++)
			arreglo[i] = arreglo[i + 1];
	}
	
	public static void mostrarArreglo(int[] arreglo) {
		for (int i = 0; i < MAX; i++) {
			if (i == 0) {
				System.out.print("{" + arreglo[i] + ", ");
			} else if (i == MAX - 1) {
				System.out.println(arreglo[i] + "}");
			} else {
				System.out.print(arreglo[i] + ", ");
			}
		}
	}
}