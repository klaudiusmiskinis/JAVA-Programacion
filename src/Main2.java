import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		int num = 0;
		int resto = 0;
		
		System.out.println("Introduce tu número");
		resto = reader.nextInt();
		
		resto = resto % 2;
		
		if (resto != 0) {
		System.out.println("Tu numero es impar");
			
		} else if (resto == 0); {
			
		System.out.println("Tu numero es par");
		
		}
		
	}
		
}