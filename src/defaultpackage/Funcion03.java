package defaultpackage;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Funcion03 {

	public static void main(String[] args) {
		
		String frase = "";
		char array[];
		String [] resultado = new String [10];

		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		frase = reader.nextLine();
		resultado = espacios(frase);
	}
	
	public static String[] espacios(String a) {
		String [] resultado = null;
		String blanco = a.replaceAll(" +,", " ");
		String larg = "La longitud de la cadena resultante es:";
		int contador = 0;
		int digitos = 0;
		int puntos = 0;
		int espacios = 0;
		
		for(int i = 0; i < blanco.length(); i++) {
			char letras = blanco.charAt(i); 
		
			
			if("aieou".contains(String.valueOf(letras))) {
				contador++;
			} if("0123456789".contains(String.valueOf(letras))) {
				digitos++;
			} if(".:,;".contains(String.valueOf(letras))) {
				puntos++;
			} if(" ".contains(String.valueOf(letras))) {
				espacios++;
			}
		}
		String c= "El numero de vocales es: "+contador;
		String d= "El numero de vocales es: "+digitos;
		String p= "El numero de vocales es: "+puntos;
		String e= "El numero de vocales es: "+espacios;
		
		resultado[0] = blanco;
		resultado[1] = larg;
		resultado[2] = c;
		resultado[3] = d;
		resultado[4] = p;
		resultado[5] = e;
		
		return resultado;
	}
	
}