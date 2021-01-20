import java.util.Random;
import java.util.Scanner;

public class Funciones {
	
	public static void main(String[] args) {

	//"public static [void/int/string/array] [nombre_funcion] ( )" se pondrá siempre.
	//Nombre siempre en minúsculas.
	//Dentro de los parantesis se pasaran los parametros. Se pasaran de la siguiente manera:
	//Fuera del main
	//Si queremos que devuelva una variable, necesitamos utilizar un return.
	/*
	int r = 0;
	r = restar(5,3);
		public static int restar (int a, int b) {
			int c = 0;
			c = a - b;
			return c;*/
		
		
		Scanner reader = new Scanner(System.in);
		Random ran = new Random();
		
		//EJEMPLO 1
		/*
		String nombre = "Klaudius";
		String nC = "";
		int num = 0;
		nC = frase(nombre);
		System.out.println(nC);
		*/
		
		//EJEMPLO 2
		/*
		int base = 0;
		int altura = 0;
		int resultado = 0;
		System.out.println("Introduce la base");
		base = reader.nextInt();
		System.out.println("Introduce la altura");
		altura = reader.nextInt();
		resultado = area(base,altura);
		System.out.println("El área es: "+resultado);
		*/
		
		//EJEMPLO 3
		int array [] = new int[5];
		int paco = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10)+1;
			System.out.println(array[i]);
		}
		paco = f(array);
		System.out.println("\n"+paco);
	}
	
	//EJEMPLO 1
	/*
	public static String frase(String n) {
		String apellido = " Miskinis";
		String nomCompleto = n + apellido;
		return nomCompleto;
	}*/
	
	//EJEMPLO 2
	/*
	public static int area (int i, int j) {
		i = (i*j)/2;
		return i;
	}*/
	
	//EJEMPLO 3
	public static int filho(int[] a) {
		
		int valor = 10;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < valor) {
				valor = (int)a[i];
			}
		}
		return valor;
	}

}
		