package RepasoApuntes;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class Buscaminas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int columna = 0;
		int fila = 0;
		int[][] minas = new int [10][10];
		int[][] buscaminas = new int [10][10];
		int probabilidad = 0;
		int a = 0;
		int b = 0;
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();

		for (a = 0; a < 9; a++) {
			System.out.print(" " + a +" "); 
			for (b = 0; b < 9; b++) {
				buscaminas[a][b] = 0;
				System.out.print(buscaminas[a][b] +" ");
			} System.out.println(); 
		} for (a = 0; a < 9; a++) {
			for (b = 0; b < 9; b++) {
				probabilidad = aleatorio.nextInt(10);
				if (probabilidad == 1) { 		   
					minas[a][b] = 1;
				}
			}
		} do {
			System.out.println();
			do {
				System.out.println("Introduce la columna");
				columna = reader.nextInt();
			} while (columna < 0 || columna > 9);
			do{
				System.out.println("Introduce la fila");
				fila = reader.nextInt();		
			} while (fila < 0 || fila > 9);
			if (minas[fila][columna] == 0) {
				System.out.println("No bomba");
				minas[fila][columna] = 2;
				buscaminas[fila][columna] = 2;
			} else if (minas[fila][columna] == 1) {
				System.out.println("Bomba, estas muerto");
				minas[fila][columna] = 3;
				buscaminas[fila][columna] = 3;
			} for (a = 0; a < 9; a++) {
				System.out.print(" " + a +" "); 
				for (b = 0; b < 9; b++) {
					System.out.print(buscaminas[a][b] +" ");
				}
			}
		} while (minas[fila][columna] != 3);

		System.out.println("\nFin del juego");
		reader.close();
	}
}