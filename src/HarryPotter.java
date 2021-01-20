import java.util.Scanner;

public class HarryPotter {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == comparar
		// != distinto a lo que haya a la derecha
		// >= mayor o igual que lo que haya a la derecha
		// <= menor o igual que lo que haya a la derecha
		// && ademas
		
		Scanner reader = new Scanner(System.in);
		double altura = 0;
		double kilos = 0;
		int year = 0;
		int escoba = 0;
		int contador = 0;
		double relacion = 0;
	
		//AÑO DE NACIMIENTO
		//Para coger el ultimo digito como dato debemos hacer dividir el numero entre 10, el resto será el último numero a coger.
		System.out.println("Introduce tu año de nacimiento. Ej: 1997");
		year = reader.nextInt();
		if (year % 10 == 4) {
			contador++;
		} else if (year % 10 == 5) {
			contador++;
		} if (year % 10 == 7) {
			contador++;
		}
		//Relación Altura-Peso
		System.out.println("Ahora introduce tu altura en centímetros. Ej: 183");
		altura = reader.nextDouble();
		System.out.println("Ahora introduce tu peso en kilogramos. Ej: 67");
		kilos = reader.nextDouble();
		
		relacion = altura + kilos;
		if (relacion /100 >= 2.40 && relacion /100 <= 2.51) {
			contador++;
		} 
		//Velocidad de escoba
		System.out.println("Introduce la velocidad de tu escoba en km/h. Ej: 94");
		escoba = reader.nextInt();
		if (escoba > 100 && escoba % 11 == 0) {
			contador++;
		}
		
		//Requisitos
		if (escoba == 0 || year == 0 || kilos == 0 || altura == 0) {
			System.out.println("Debes introducir valores mayores que 0");
		} else if (contador == 3 || contador == 2 || contador == 1) {
			System.out.println("El candidato cumple: " + contador);
		} else {
			System.out.println("No cumples ningun requisito, lo sentimos.");
		}

	
	}
	
}

		