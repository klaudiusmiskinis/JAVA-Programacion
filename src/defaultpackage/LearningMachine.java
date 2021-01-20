package defaultpackage;
import java.util.Scanner;

public class LearningMachine {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {


		//KLAUDIJUS MISKINIS		
		//Inicializamos las variables
		Scanner reader = new Scanner(System.in);
		String a ="";
		String b ="";
		int i = 0;
		int j = 0;
		char aUltimo =' ';
		char bUltimo =' ';
		int [] contador = new int [25];
		char caracteresA[];
		char caracteresB[];

		System.out.println("LEARNING MACHINE");
		System.out.println("Hola, en este programa vamos a contar las letras que hay entre las dos frases,\nes decir, si tu escribes: holA mon mundial!# y paco#, veremos que letras se repiten.");
		System.out.println("Introduce la primera frase:");
		a = reader.nextLine();	//Se recoge la frase.
		aUltimo = a.charAt(a.length()-1); //Se recoge el ultimo caracter para comprobar si es un #.
		caracteresA = a.toCharArray(); //Se cambia la cadena a a un array de char.
		while (a.length()>80) { //While para control de datos de Caracteres.
			System.out.println("Error.Hay un límite de 80 caractéres. Por favor, introduce otra frase más corta");
			a = reader.nextLine();
			caracteresA = a.toCharArray();
		} while (aUltimo!='#') {
			System.out.println("Error. Introduce un # al final de tu frase"); 
			a = reader.nextLine();
			aUltimo = a.charAt(a.length()-1);
			caracteresA = a.toCharArray();
		}
		System.out.println("Introduce la segunda frase:"); //Se recoge la frase a comparar.
		b = reader.nextLine();
		bUltimo = b.charAt(b.length()-1);
		caracteresB = b.toCharArray(); //Se cambia la cadena b a un array de char.
		while (b.length()>25) {
			System.out.println("Error. Hay un límite de 25 caractéres. Por favor, introduce otra frase más corta");
			b = reader.nextLine();
		} while (bUltimo!='#') {
			System.out.println("Error. Introduce un # al final de tu frase"); //while control de datos de #.
			b = reader.nextLine();
			bUltimo = b.charAt(b.length()-1);
		} for(i = 0; i < b.length();i++) { //Iniciamos el for para tener la posicion de las letras de la cadena b.
			for(j = 0; j < a.length();j++) { //Iniciamos el for para tener la posicion de las letras de la cadena a.
				if (caracteresB[i] == caracteresA[j]){ //Si las letras son iguales el contador sumará 1.
					contador[i] ++; 
				}
			}
		} for (i = 0; i <contador.length; i++) { //la longitud del contador nos dira cuantas veces se hara el for.
			if((caracteresB[i]!='#' && caracteresB[i]!=' ') && contador[i] != '0') //si el caracter es diferente de # o espacio y el contador tiene un valor superior a 0, se hara el if.
				System.out.println(caracteresB[i]+"->"+contador[i]); //nos printara en diferentes lineas las letras.
		} System.out.println("Fin del programa");
	}
}