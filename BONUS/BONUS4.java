import java.util.Scanner;

public class BONUS4 {

	public static void main(String[] args) {

		//VARIABLES
		Scanner reader = new Scanner(System.in);
		int fila = 0;
		int columna = 0;
		int i = 0;

		//ESCANER QUE PIDE LOS VALORES
		System.out.print("Introduce el numero de filas y columnas");
		fila = reader.nextInt();
		columna = reader.nextInt();
		
		//IF PARA CONDICION DE NUMEROS NEGATIVOS Y MAYORES QUE 10. SI EL USUARIO INTRODUCE LOS DATOS MAL OTRA VEZ, DEBERA REINICIAR EL PROGRAMA
		if (fila < 0 || columna < 0 || fila > 10 || columna > 10) {
			System.out.println("Introduce valores menores de 10 y no negativos");
			System.out.println("Volver a introducir el numero de filas y columnas");
			fila = reader.nextInt();
			columna = reader.nextInt();
		}
		//CREAMOS LA VARIABLE LAN PARA QUE RECOGA LOS NUMEROS DE FILA Y COLUMNA DESPUES DE QUE EL USUARIO LAS HAYA INTRODUCIDO.
		//El valor de los corchetes es el que reciben tras el usuario introducir la fila y la columna.
		int lan[][] = new int [fila][columna];
		//BUCLE PARA QUE EL PRINT SEA SECUENCIAL
		for (int a = 0; a < lan.length; a++) {
			for (int b = 0; b < lan[a].length; b++) {
				System.out.print(a + "" + b + " ");
			}
			//Se introduce el print con salto de linea fuera del for porque no se ejecutara entre las filas y columnas
			System.out.print("\n");
		}

		/*REFERENCIAS:
		 * https://es.stackoverflow.com/questions/127422/como-obtener-numero-de-filas-y-columnas-de-una-matriz
		 * https://picodotdev.github.io/blog-bitix/2017/07/4-formas-de-hacer-un-bucle-for-en-java/
		 * https://www.programarya.com/Cursos/Java/Salida-de-datos
		 * https://es.wikihow.com/imprimir-un-arreglo-en-Java
		 * https://decodigo.com/java-el-ciclo-for
		 */

	}

}