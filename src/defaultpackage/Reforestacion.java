package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class Reforestacion {

	public static void main(String[] args) {


		//Inicializacion
		Scanner reader = new Scanner(System.in);
		int hectarea = 0;
		int metroscuadrados = 0;
		float porcentaje = 0;
		int exceso = 1000000;
		int pino = 0;
		int	oyamel = 0;
		int cedro = 0;
		int usuario = 0;

		//Datos que introduce el usuario y recoge la variable
		System.out.println("¡Hola!");
		System.out.println("En este programa podrás obtener los resultados\npara reforestar una zona con las condiciones que pone el Gobierno de México.");
		do {
			System.out.println("\nPara empezar, introduce la superficie en hectáreas.");
			hectarea = reader.nextInt();
			while (hectarea<0) {
				System.out.println("Porfavor, introduce un valor que no sea negativo.");
				hectarea = reader.nextInt();
			} while (hectarea==0) {
				System.out.println("Si introduces 0, los resultados seran 0.");
				hectarea = reader.nextInt();
			}
			//Paso de hectareas a metros cuadrados
			metroscuadrados = hectarea*10000;
			System.out.println("Pasamos las hectáreas a metros cuadrados, que son: "+metroscuadrados+".\n");
			System.out.println("Ahora el programa decidira si excede los requisitos del Gobierno o no.\n");

			//Si el usuario introduce mayor que 1M de metros cuadrados o 100hectareas
			if (metroscuadrados >= exceso) {
				pino = (metroscuadrados*70)/100;
				oyamel = (metroscuadrados*20)/100;
				cedro = (metroscuadrados*10)/100;
				System.out.println("El terreno excede 1M de metros cuadrados.\n");
			} else if (metroscuadrados < exceso) {
				pino = (metroscuadrados*50)/100;
				oyamel = (metroscuadrados*30)/100;
				cedro = (metroscuadrados*20)/100;
				System.out.println("El terreno no excede 1M de metros cuadrados.\n");
			}
			//Calculo de arboles que se pueden plantar en total
			pino = pino/10;
			pino = pino*8;
			oyamel = oyamel/15;
			oyamel = oyamel*15;
			cedro = cedro/18;
			cedro = cedro*10;

			//Print final de lo que el gobierno quiere saber
			if (pino==pino) {
				System.out.println("Podemos plantar "+pino+" pinos.");
				System.out.println("Podemos plantar "+oyamel+" oyameles.");
				System.out.println("Podemos plantar "+cedro+" cedros.\n");
			} System.out.println("¿Deseas volver a calcular otro terreno?");
			System.out.println("Introduce un 1 para seguir o un 0 para salir");
			usuario = reader.nextInt();
		} while (usuario==1);
	} 
}


