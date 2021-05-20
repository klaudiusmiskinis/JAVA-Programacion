package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class PruebaDosExamenKlaudijusMiskinis {

	public static void main(String[] args) {
		//KlaudijusMiskinis
		Scanner reader = new Scanner(System.in);
		Random aleatorio = new Random();

		//Inicialización
		int temperatura1 = 0;
		int temperatura2 = 0;
		int lluvia1 = 0;
		int lluvia2 = 0;
		int mediatemp = 0;
		int medialluvias = 0;
		int respuesta = 0;

		//Entrada de datos
		System.out.println("En este programa vamos a calcular la temperatura y las lluvias de dos dias diferentes.\n");
		do {
			System.out.println("Por favor, introduce la temperatura del día 1 en Celsius.");
			temperatura1 = reader.nextInt();
			System.out.println("Ahora la temperatura del día 2. Recuerda, en Celsius.");
			temperatura2 = reader.nextInt();
			System.out.println("Por favor, introduce lo que ha llovido en el día 1 en Litros.");
			lluvia1 = reader.nextInt();
			System.out.println("Ahora la lluvia del día 2. Recuerda, en Litros.");
			lluvia2 = reader.nextInt();
			//En caso de que el usuario introduzca valores erroneos
			while ((temperatura1<-20||temperatura1>60)||(temperatura2<-20||temperatura2>60)) {
				System.out.println("Por favor, introduce temperaturas válidas (menor de 60ºC o mayor que -20ºC.");
				System.out.println("Introduce la temperatura del día 1 en Celsius.");
				temperatura1 = reader.nextInt();
				System.out.println("Ahora la temperatura del día 2. Recuerda, en Celsius.");
				temperatura2 = reader.nextInt();
			}
			//Procesamiento de datos
			//Hago la media de las lluvias para la condicion de Fredolics y por añadir unos datos más para el usuario
			medialluvias = lluvia1+lluvia2/2;
			mediatemp = temperatura1+temperatura2/2;

			if ((temperatura1<20&&temperatura1>10)&&(temperatura2<20&&temperatura2>10)&&(lluvia1<20&&lluvia1>10)&&(lluvia2<20&&lluvia2>10)) {
				System.out.println("Hubó rovellons.");
			} else if ((mediatemp>=1&&mediatemp<=5)&&(lluvia1==0&&lluvia2==0)) {
				System.out.println("Hubó fredolics.");
			}

			//Output para el usuario de los datos porcesados
			System.out.println("Temperatura del dia 1: "+temperatura1+"Cº.");
			System.out.println("Temperatura del dia 2: "+temperatura2+"Cº.");
			System.out.println("Lluvias del dia 1: "+lluvia1+"L.");
			System.out.println("Lluvias del dia 2: "+lluvia2+"L.");
			System.out.println("Entre ambos dias hubo una temperatura media de: "+mediatemp+"ºC.");
			System.out.println("Entre ambos dias llovio una media de: "+medialluvias+"L.");
			System.out.println("¿Deseas volver a utilizar el programa?\nIntroduce 1 para seguir o cualquier otra número para salir.");
			respuesta = reader.nextInt();
		} while(respuesta==1); {
			//Cuando el usuario teclee un número diferente al 1
			System.out.println("Fin del programa.");
		}
	}
}


