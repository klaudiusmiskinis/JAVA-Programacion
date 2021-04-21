package defaultpackage;
import java.util.Random;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		int num[] = new int[10];
		int numero = 0;
		int resultado = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = aleatorio.nextInt(100)+1;
		} 
		System.out.println("Introduce un numero");
		numero = reader.nextInt();
		resultado = buscar(numero, num);
		System.out.println(resultado);
	}

	public static int buscar (int a, int b[]) {
		int num1 = -1;
		
		if (b.length!=0) {
			for(int i = 0; i < b.length; i++) {
				if(a==b[i]) {
					return i;
				}
			}
		}
		return num1;
	}
}