package RepasoApuntes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		
		int num2 = 0;
		int num1 = 0;
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		int division = num1 / num2;
		int resto = num1 % num2;
		
		num1 = reader.nextInt();
		
		System.out.println("Introduce tu segundo numero");
		num2 = reader.nextInt();
		
		System.out.println("Tu resultado en la suma es " + suma);
		System.out.println("Tu resultado en la resta es " + resta);
		System.out.println("Tu resultado en la multiplicación es " + multiplicacion);
		System.out.println("Tu resultado en la división es " + division);
		System.out.println("Tu resultado en el resto es " + resto);
	}

}
