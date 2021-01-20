import java.util.Scanner;

public class Exercici5 {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == comparar
		// != distinto a lo que haya a la derecha
		// >= mayor o igual que lo que haya a la derecha
		// <= menor o igual que lo que haya a la derecha
		// && ademas
		
		Scanner reader = new Scanner(System.in);
		int num1 = 0;
		
		System.out.println("Introduce el número");
		num1 = reader.nextInt();
		
		if (num1 > 10) {
		System.out.println("El numero es mayor que 10");
		} else if (num1 < 10) {
				System.out.println("El numero es menor que 10");
		} else {
			System.out.println("El numero es igual a 10");
			}
	
	}
	
}
		