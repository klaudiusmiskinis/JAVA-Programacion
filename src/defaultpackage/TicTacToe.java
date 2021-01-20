package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {


		//KLAUDIJUS MISKINIS		
		//Inicializamos las variables
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		int [][] ttt = new int [4][4];
		int	[][] escogido = new int [4][4];
		int fila = 0;
		int columna = 0;
		int filaJug = 0;
		int columnaJug = 0;
		int turno = 0;
		boolean pasar = false;
		int i = 0;
		int j = 0;

		//Printamos la matriz
		for(i = 0; i < 3; i++) {
			System.out.println();
			for(j = 0;j < 3; j++) {
				System.out.print(ttt[i][j]+" ");
			}
		} System.out.println();
		//CONTROL DE ERRORES
		do {
			do {
				do {
					System.out.println("\nTurno del jugador 1");
					System.out.println("Introduce la fila. Las filas son: 0, 1 y 2");
					fila = reader.nextInt();
				} while(fila>2||fila<0);
				do {
					System.out.println("Introduce la columna. Las columnas son: 0, 1 y 2");
					columna = reader.nextInt();
					if (ttt[fila][columna] == 1 || ttt[fila][columna] == 2) {
						System.out.println("Esta casilla ya se ha utilizado");
					}
				} while(columna>2||columna<0);
				//CADA TURNO SUMARA UNO HASTA LLEGAR A 9
				turno++;
				//CAMBIAREMOS EL LA CASILLA SELECIONADA DE 0 A 1 EN CASO DE QUE ESA CASILLA CONTENGA UN 0
				if(ttt[fila][columna] == 0) {
					ttt[fila][columna]=1;
					//PRINTAREMOS LA MATRIZ CON LOS NUEVOS DATOS
				} for(i = 0; i < 3; i++) { 
					System.out.println();
					for (j = 0; j < 3; j++) {
						System.out.print(ttt[i][j]+" ");
					}
				}
			} while (ttt[fila][columna] == 0); //SI LA MATRIZ ESCOGIDA CONTIENE UN 0, PASAREMOS EL TURNO AL SIGUIENTE JUGADOR
			do {
				System.out.println("\n\nTurno del jugador 2");
				do {
					System.out.println("Introduce la fila. Las filas son: 0, 1 y 2");
					filaJug = reader.nextInt();
				} while(fila>2||fila<0);
				do {
					System.out.println("Introduce la columna. Las columnas son: 0, 1 y 2");
					columnaJug = reader.nextInt();
				} while(columna>2||columna<0);
				turno++;
				if(ttt[filaJug][columnaJug] == 0) {
					ttt[filaJug][columnaJug]=2;
				} for(i = 0; i < 3; i++) {
					System.out.println();
					for (j = 0; j < 3; j++) {
						System.out.print(ttt[i][j]+" ");
					}
				}
			} while (ttt[filaJug][columnaJug] == 0); //POSIBILIDADES DE VICTORIA  
			if ((ttt[0][0] == 1 && ttt[1][1] == 1 && ttt[2][2] == 1)
					|| (ttt[0][0] == 1 && ttt[0][1] == 1 && ttt[0][2] == 1)
					|| (ttt[0][0] == 1 && ttt[1][0] == 1 && ttt[2][0] == 1)
					|| (ttt[0][1] == 1 && ttt[1][1] == 1 && ttt[2][1] == 1)
					|| (ttt[2][0] == 1 && ttt[2][1] == 1 && ttt[2][2] == 1)
					|| (ttt[0][2] == 1 && ttt[1][2] == 1 && ttt[2][2] == 1)
					|| (ttt[0][1] == 1 && ttt[1][1] == 1 && ttt[2][1] == 1)
					|| (ttt[2][2] == 1 && ttt[2][1] == 1 && ttt[2][0] == 1)) {
				System.out.println("\n\nHas ganado");
				turno = 9;
			} else if ((ttt[0][0] == 2 && ttt[1][1] == 2 && ttt[2][2] == 2)
					|| (ttt[0][0] == 2 && ttt[0][1] == 2 && ttt[0][2] == 2)
					|| (ttt[0][0] == 2 && ttt[1][0] == 2 && ttt[2][0] == 2)
					|| (ttt[0][1] == 2 && ttt[1][1] == 2 && ttt[2][1] == 2)
					|| (ttt[2][0] == 2 && ttt[2][1] == 2 && ttt[2][2] == 2)
					|| (ttt[0][2] == 2 && ttt[1][2] == 2 && ttt[2][2] == 2)
					|| (ttt[0][1] == 2 && ttt[1][1] == 2 && ttt[2][1] == 2)
					|| (ttt[2][2] == 2 && ttt[2][1] == 2 && ttt[2][0] == 2)) {
				System.out.println("\n\nHa ganado el segundo jugador");
				turno = 9;
			}
		} while (turno!=9);
		System.out.println("Fin del programa");
	} 
}