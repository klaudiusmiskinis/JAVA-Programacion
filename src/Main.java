import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		int resta = 0;
		int multiplicacion = 0;
		int division = 0;
		int resto = 0;
		
		System.out.println("Introduce tu primer número");
		
		num1 = reader.nextInt();
		
		System.out.println("Introduce tu segundo número");
		
		num2 = reader.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		resto = num1 % num2;
		
		System.out.println("Tu resultado es de suma es:" + suma);
		System.out.println("Tu resultado es de resta es: " + resta);
		System.out.println("Tu resultado es de multiplicacion es: " + multiplicacion);
		System.out.println("Tu resultado es de division es: " + division);
		System.out.println("Tu resultado es de resto es: " + resto);
		
		}

}