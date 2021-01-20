import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == comparar
		// != distinto a lo que haya a la derecha
		// >= mayor o igual que lo que haya a la derecha
		// <= menor o igual que lo que haya a la derecha
		// && ademas
		
		Scanner reader = new Scanner(System.in);
		
		int resto = 0;
		int num1 = 0;
		
		System.out.println("Introduce tu número");
		num1 = reader.nextInt();
		
		resto = num1 % 2;
		
		if (resto != 0 && num1 < 30 ){
		System.out.println("Tu numero es Nelson");
			
		} else if (resto == 0 && num1 > 10) {
		System.out.println("Tu numero es Fonsi");
		
		} else {
			System.out.println("Tu numero no es ni Fonsi ni Nelson");
		}
			
		
		}
		
		}