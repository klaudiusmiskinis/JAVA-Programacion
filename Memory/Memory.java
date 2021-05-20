package defaultpackage;
import java.util.Random;
import java.util.Scanner;



public class Memory {

	public static void main(String[] args) {


		//KLAUDIJUS MISKINIS		
		//Inicializamos las variables
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] caracteres = abc.toCharArray();
		char[][] memory = new char [9][9];
		char[][] memoryOculto = new char [9][9];
		char pareja = ' ';
		char parejaDos = ' ';
		int usuario = 0;
		boolean pasar = false;
		int grande = 8;
		int mediano = 6;
		int pequeño = 4;
		int contador = 0;
		int random = 0;
		int i = 0;
		int j = 0;
		int a = 0;
		System.out.println("Elige el tablero escogiendo el número");
		System.out.println("1 | PEQUEÑO 4x4");
		System.out.println("2 | MEDIANO 6x6");
		System.out.println("3 | GRANDE 8x8");
		usuario = reader.nextInt();
		while(usuario>3 || usuario<0) {
			System.out.println("Error, escoge un número válido entre 1 y 3");
			usuario = reader.nextInt();
		} if (usuario == 3) {
			usuario = grande;
		} else if (usuario == 2) {
			usuario = mediano;
		} else {
			usuario = pequeño;
		}
		do {
			//Printamos la matriz
			for(i=0;i<usuario;i++) {
				random = abc.charAt(aleatorio.nextInt(26));
				
				pareja = (char)(random);
				parejaDos = (char)(random);
				a = aleatorio.nextInt(2);
				if (a == 0) {
					pasar = false;
				} else {
					pasar = true;
					if (pasar == true) {
						memory[i][j] = pareja;
					} else if (pasar == false) {
						memory[i][j]= parejaDos;
					}
				} System.out.println();
				for(j=0;j <usuario;j++) {
					if (pasar == true) {
						memory[i][j]= parejaDos;
					} else if (pasar == false) {
						memory[i][j] = (char)(aleatorio.nextInt(25)+65);
					} System.out.print(memory[i][j]+" ");
				}
			} System.out.println();
		} while (contador == 2);
	} 
}