import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import defaultpackage;

public class LaPrimitiva {

	public static void main(String[] args) {

		//INICIALIZAMOS
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();
		int[] numeros = new int[6];
		int[] primitiva = new int[6];
		int salir = 0;
		boolean volver = true;
		int contador = 0;

		do {
			primitiva[0] = aleatorio.nextInt(48)+1;
			primitiva[1] = aleatorio.nextInt(48)+1;
			primitiva[2] = aleatorio.nextInt(48)+1;
			primitiva[3] = aleatorio.nextInt(48)+1;
			primitiva[4] = aleatorio.nextInt(48)+1;
			primitiva[5] = aleatorio.nextInt(48)+1;
			//utilizamos el m�todo .sort(); para poder ordenar de mayor a menor
			Arrays.sort(primitiva);

			System.out.println("Hola, vas a jugar a LA PRIMITIVA.\nPor favor introduce tu primer n�mero de seis, recuerda que debe ser de 1 al 49");
			numeros[0] = reader.nextInt();
			while (numeros[0]>49|| numeros[0]<1) {
				System.out.println("Introduce tu primer n�mero, recuerda que debe ser de 1 al 49");
				numeros[0] = reader.nextInt();
			}
			System.out.println("Introduce el segundo n�mero");
			numeros[1] = reader.nextInt();
			while (numeros[1]>49|| numeros[1]<1) {
				System.out.println("Error.Introduce el segundo n�mero");
				numeros[1] = reader.nextInt();
			}
			System.out.println("Introduce el tercer n�mero");
			numeros[2] = reader.nextInt();
			while (numeros[2]>49|| numeros[2]<1) {
				System.out.println("Error.Introduce el tercer n�mero");
				numeros[2] = reader.nextInt();
			}
			System.out.println("Introduce el cuarto n�mero");
			numeros[3] = reader.nextInt();
			while (numeros[3]>49|| numeros[3]<1) {
				System.out.println("Error.Introduce el cuarto n�mero");
				numeros[3] = reader.nextInt();
			}
			System.out.println("Introduce el quinto n�mero");
			numeros[4] = reader.nextInt();
			while (numeros[4]>49|| numeros[4]<1) {
				System.out.println("Error.Introduce el quinto n�mero");
				numeros[4] = reader.nextInt();
			}
			System.out.println("Introduce el sexto n�mero");
			numeros[5] = reader.nextInt();
			while (numeros[5]>49|| numeros[5]<1) {
				System.out.println("Error.Introduce el sexto n�mero");
				numeros[5] = reader.nextInt();
			}
			//metodo sort para ordenar de mayor a menor
			Arrays.sort(numeros);

			for(int a = 0; a<numeros.length;a++) {
				if (numeros[a]==primitiva[0]||numeros[a]==primitiva[1]||numeros[a]==primitiva[2]||numeros[a]==primitiva[3]||numeros[a]==primitiva[4]||numeros[a]==primitiva[5]) {
					contador++;

				}
			}
			System.out.print("Has introducido los siguientes n�meros: ");
			for(int j=0; j<numeros.length;j++) {
				System.out.print(numeros[j]+" ");
			} System.out.println("\n");
			System.out.println("Los n�meros de LA PRIMITIVA son: ");
			for(int i=0; primitiva.length>i;i++) {
				System.out.print(primitiva[i]+" ");
			}
			System.out.println("\n");
			if (contador==0) {
				System.out.println("No has acertado ning�n n�mero");
			} else {
				System.out.println("Veces que has acertado: "+contador);
			}
			System.out.println("�Deseas volver a jugar? Introduce 0 para seguir o cualquier n�mero para salir");
			salir = reader.nextInt();

		} while (volver==true);
		System.out.println("Fin del programa");
	}
}