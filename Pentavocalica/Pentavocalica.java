package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class Pentavocalica {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {

		//VARIABLES String para guardar cadenas de palabras
		//VARIABLE Int para guardar estables.
		//VARIABLE String letra para recoger la letra que quiera introducir el usuario.
		Scanner reader = new Scanner(System.in);

		String pentavocalica="";
		String minuscula="";
		int repite = 0;
		int palabras = 0;
		int contador = 0;
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;

		System.out.println("Hola, este es el programa que te dice si tu palabra es pentavocálica");
		System.out.println("\nDebes de tener en cuenta una par de cosas:");
		System.out.println("· La palabra no debe tener más de 30 letras");
		System.out.println("· No introduzcas tildes");
		System.out.println("Introduce el numero de palabras que vas a escribir");
		palabras = reader.nextInt();

		do {
			for(int i = 0; i<palabras; i++) {
				reader.nextLine();
				System.out.println("Por favor, introduce la palabra");
				pentavocalica = reader.nextLine();
				minuscula = pentavocalica.toLowerCase();

				for(int j = 0; j < minuscula.length(); j++){
					if (minuscula.charAt(j)=='a') {
						contadorA = 1;
					} else if (minuscula.charAt(j)=='e') {
						contadorE = 1;
					} else if (minuscula.charAt(j)=='i') {
						contadorI = 1;
					} else if (minuscula.charAt(j)=='o') {
						contadorO = 1;
					} else if (minuscula.charAt(j)=='u') {
						contadorU = 1;
					} contador = contadorA+contadorE+contadorI+contadorO+contadorU;
				} if (contador==5) {
					System.out.println("La palabra "+pentavocalica+" es pentavocálica"); 
				} else if (contador!=5) {
					System.out.println("La palabra no es pentavocálica");
				} System.out.println("¿Deseas introducir otra palabra? Pon 0 para salir o otro numero para seguir");
				repite = reader.nextInt();
				if(repite!=0) {
					pentavocalica="";
					contadorA = 0;
					contadorE = 0;
					contadorI = 0;
					contadorO = 0;
					contadorU = 0;
					contador = 0;
					reader.nextLine();
				}
			}
		} while (repite!=0); {
			contadorA = 0;
			contadorE = 0;
			contadorI = 0;
			contadorO = 0;
			contadorU = 0;
		}
	}
}
