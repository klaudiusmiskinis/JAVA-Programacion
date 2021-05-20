package defaultpackage;
import java.util.Random;

public class BONUS8 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		int[] numeros = new int[1000];
		int dinero = 15000;
		int premiado = 0;
		int contador = 0;

		premiado = aleatorio.nextInt(21)+1;
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = aleatorio.nextInt(21)+1;
			if (numeros[i]==premiado) {
				contador++;
			}
		}
		System.out.println("El número premiado es: "+premiado);
		System.out.println("El número premiado les ha tocado a " +contador);
		System.out.println("El dinero a repartir es "+dinero/contador+" por persona");

	}
}


