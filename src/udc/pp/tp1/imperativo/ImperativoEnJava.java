package udc.pp.tp1.imperativo;

public class ImperativoEnJava {
	
	/*
	 * Realiza la suma algebraica entre los operadores
	 * 
	 */
	public static int suma(int a, int b) {
		return 0;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static double maximo (double a, double b) {
		return 0;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static double maximo (double a, double b, double c) {
		return 0;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static int maximo(int... valores) {
		return 0;
	}
	
	/*
	 * Devolver el valor absoluto
	 */
	public static float valorAbsoluto(float valor) {
		return 0;
	}
	
	/*
	 * Devolver verdadero se el valor es par
	 */
	public static boolean esPar(int valor) {
		return false;
	}
	

	/*
	 * Indicar si el año recibido como paremtro es bisiesto.
	 * Son bisisetos los años divisibles por cuatro que no sean 
	 * divisibles por cien, los años divisibles por cuatrocientos 
	 * son siempre bisiestos.
	 */
	public static boolean esBisiesto(int anio) {
		return false;
	}
	
	/*
	 * Devolver la cantidad de días que tien cada mes, 28 para el mes de febrero
	 */
	public static int cantidadDias(int mes) {
		return 31;
	}
	
	
	/*
	 * Convierte temperatura expresada en Fahrenheit a centígrados  
	 */
	public static float fahrenheitToCelsius(float fahrenheit) {
		return 0;
	}

	/*
	 * Convierte temperatura expresada en centígrados a Fahrenheit   
	 */	
	public static float celsiusToFahrenheit(float celsius) {
		return 0;
	}

	/*
	 * Día de la semana según la norma ISO8601
	 * domingo=7, lunes=1, martes=2,..., sabado=6
	 * En minúsculas y sin tilde
	 */
	public static String diaSemana (int numeroDia) {
		return "osvaldo";
	}

	/*
	 * Devuelve la suma acumulada de los números de 1 a n 
	 */
	public static int sumaAcumulada(int n) {
		return 0;
	}
	
	/*
	 * Devuelve el factorial de n
	 */
	public static int factorial(int n) {		
		return 0;
	}
	
	/*
	 * Devuelve verdadero si el número es primo
	 */
	public static boolean esPrimo(int valor){
		return false;		
	}
		
	/*
	 * Devuelve el valor promedio de los números informadoa 
	 */
	public static float promedio(int... valores) {
		return 0;
	}
		
	/*
	 * Ordena el arreglo informado, devuelve una referencia 
	 * al arreglo recibido
	 */
	public static int[] ordenar (int[] valores) {
		return valores;
	}

	/*
	 * Invierte los valores del arreglo informado, 
	 * devuelve una referencia al arreglo recibido 
	 */
	public static int[] invertir (int[] valores) {
		return valores;
	}
	
	/*
	 * Devuelve el enésimo valor de la sucesión de fibonacci
	 */
	public static int fibonacci(int n) {
		return 0;
	}
	
	/*
	 * Devuelve la sucesión de fibonacci de orden n 
	 */
	public static int[] sucesionFibonacci (int n) {
		int[] retval = {1, 2, 3};
		return retval;
	}
	
	/*
	 * Devuelve un arreglo que es la concatenación de los arreglos recibidos
	 */
	public static String[] concatenar(String[] arreglo1, String [] arreglo2) {
		return arreglo1;
	}

	/*
	 * Cifrado Cesar para codificar y decodificar un texto
	 * con desplazamaiento 1
	 * https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar
	 * alfabeto abcdefghijklmnopqrstuvwxyz
	 * los espacios se mantienencomo espacios
	 */
	public static String cifradoCesar (String cadena) {
		return cadena;
	}

	/*
	 * Cifrado Cesar para codificar y decodificar un texto con
	 * desplazamaiento arbitrario
	 */
	public static String cifradoCesar (String cadena, int desplazamiento) {
		return cadena;
	}
	
	/*
	 * Generar el Tríangulo de Pascal de orden n
	 * https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
	 *  
	 */
	public static int [][] trinaguloPascal (int n) {
		int [][] retval = {{1},{1,1}};
		return retval;
	}
	
}
