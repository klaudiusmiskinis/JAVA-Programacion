package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class PruebaUnoExamenCopia {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();

		//Inicialización
		int toros = 0;
		int contadortoros = 0;
		int velocidad = 0;
		int corredor = 0;

		//Bucle para repeticion hasta que se introduzca un 0
		do {
			//Entrada de datos
			System.out.println("\nIntroduce el número de toros");
			toros = reader.nextInt();

			//bucle por si el usuario introduce valores erroneos
			while (toros<1 || toros>30) {
				System.out.println("Introduce el número de toros válido");
				toros = reader.nextInt();
			}
			//Procesamiento de datos
			//Utilizo el int para el numero de toros y darles la velocidad aleatoria
			for(int i = 0; i<toros; i++) {
				velocidad = aleatorio.nextInt(56)+25;
				//creo un if dentro del for para que recoja el dato mas grande y le sume 1 para superar la velocidad del toro
				if (velocidad>corredor) {
					corredor = velocidad+1;
				}
				//sumara +1 el contador de toros para que el output nos muestre el numero de toro correspondiente a cada uno.
				contadortoros++;
				System.out.println("Velocidad del toro Nº "+contadortoros+" es: "+velocidad+"\n");
				if (contadortoros==toros) {
					System.out.println("El corredor irá a "+corredor+" km/h");
					contadortoros=0;
					toros=1;
					corredor = 0;
				} 
			} 
		} while (toros!=0); {
			//Final del programa
			System.out.println("Fin del programa");
		}
	}
}


