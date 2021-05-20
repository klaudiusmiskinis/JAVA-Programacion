package defaultpackage;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//KLAUDIJUS MISKINIS
public class Prova3 {

	public static void main(String[] args) {

		//INICIALIZAMOS
		//EJERCICIO1
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		int [] numbers = new int [16]; //PARTE A
		int [] [] vector = new int [5][5];
		int jedi = 0;
		int i = 0;
		int j = 0;
		int contadorCero = 0;
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		for(i = 0; i<numbers.length;i++) {
			numbers[i]=aleatorio.nextInt(40)-20; //PARTE A
			System.out.println(numbers[i]+" ");
			if (numbers[i] == 0) {
				contadorCero++;
			} else if (numbers[i]>0) {
				contadorPositivo++;
			} else if (numbers[i]<0) {
				contadorNegativo++;
			}
		} System.out.println("Hay "+contadorPositivo+" positivos, "+contadorNegativo+" negativos y "+contadorCero+" ceros.");//PARTE B
		System.out.println();
		for(i =  0; i < 4; i++) {
			vector[i][j] = numbers[i];
			System.out.println();
			for(j = 0; j < 4; j++) {
				vector[i][j] = numbers[j];
				System.out.print(vector[i][j]+" ");
			} if (numbers[i]%2 == 0) {
				jedi++;
				System.out.println("Numero " +i+ "(Posicion "+i+","+j+") ya que es positivo, par y se divide exactamente la suma de la fila "+i);
			} System.out.println();
		}
		//EJERCICIO2 
		String a ="";
		String es = "";
		String mayusA ="";
		int palabra = 0;
		int espacios = 0;
		boolean pasar = false;
		char aUltimo =' ';
		int [] contador = new int [25];
		char caracteresA[];

		do {
			do {
				System.out.println("Introduce el texto");
				a = reader.nextLine();
				aUltimo = a.charAt(a.length()-2);
				if (aUltimo == '.') {
					aUltimo = a.charAt(a.length()-1);
					if (aUltimo == '#') {
						pasar = true;
					}
				}
				caracteresA = a.toCharArray();
			} while (pasar != true); {
				caracteresA = a.toCharArray();
				mayusA = a.toUpperCase();
				System.out.println(mayusA);
			} for(i = 0;  i<a.length();i++) {
				if(a.charAt(i)==' ') {
					espacios++;
				} if (espacios>4) {
					pasar = false;
				}
			} 
		} while (pasar!=true); {
			for(i = 0;  i<a.length();i++) {
				if(a.charAt(i)==' ') {
					palabra = i-1;
					if (a.charAt(palabra) == 'a' || a.charAt(palabra) == 'e' || a.charAt(palabra) == 'i' || a.charAt(palabra) == 'o' || a.charAt(palabra) == 'u') {
						a.replaceFirst(" ", "S ");
					} else if (a.charAt(palabra) != 'a' || a.charAt(palabra) != 'e' || a.charAt(palabra) != 'i' || a.charAt(palabra) != 'o' || a.charAt(palabra) != 'u') {
						es = a.replaceFirst(" ", "ES ");
					}
				}
			} System.out.println(paco.toUpperCase());
		}
	}
}