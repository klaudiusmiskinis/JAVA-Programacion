package defaultpackage;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {


		//KLAUDIJUS MISKINIS		
		//Inicializamos las variables
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		int fila = 10;
		int columna = 10;
		float bombas = 0;
		bombas = (10*10)*0.10;
		int [][] buscaminas = new int [fila][columna];
		System.out.println("BUSCAMINAS");

		for (int a = 0; a < buscaminas.length; a++) {
			for (int b = 0; b < buscaminas[a].length; b++) {
				System.out.print(buscaminas[a][b]+ " ");
			} System.out.print("\n");
		} 
		
		
		//Se introduce el print con salto de línea fuera del for porque no se ejecutara entre las filas y columnas
	
	}
}