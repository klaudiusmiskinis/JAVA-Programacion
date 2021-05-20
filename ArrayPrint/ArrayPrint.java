package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class ArrayPrint {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {
		
		//VARIABLES String para guardar cadenas de palabras
		//VARIABLE Int para guardar estables.
		//VARIABLE String letra para recoger la letra que quiera introducir el usuario.
		Scanner reader = new Scanner(System.in);
		String usuario;
		String letra;
		//char inicializado con =' ';
		char letras=' ';
		int contador = 0;
		
		System.out.println("Por favor, introduce tu texto");
		usuario = reader.nextLine();
		System.out.println("¿Qué letra deseas contar?");
		letra = reader.nextLine();
		//Usar el charAt para recoger la posicion del String.
		for(int i = 0; i<usuario.length();i++) {
			if(usuario.charAt(i)==letra.charAt(0)) {
				contador++; //contador de la letra que queremos repetir y se encuentra.
			}
		} System.out.println("En tu frase: "+usuario+" y tiene la letra "+letra.charAt(0)+" "+contador+" vez/veces");
	}
}


