import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == comparar
		// != distinto a lo que haya a la derecha
		// >= mayor o igual que lo que haya a la derecha
		// <= menor o igual que lo que haya a la derecha
		// && ademas
				
			Scanner reader = new Scanner (System.in);
			reader = new Scanner(System.in);
				
			int num1 = 0;
			int contador = 2;
			int resto = 0;
			int multiplo = 7;
			boolean comprobante = true;
			int respuesta = 0;
			int primo = 0;
					
			System.out.println("Introduce tu número");
				
			num1 = reader.nextInt();
			respuesta = num1;
			primo = num1;
			
			// PAR | IMPAR
				
			if (num1 % 2 == 0) {
			System.out.println("tu numero es par");
			}
			
			if (num1 % 2 != 0) {
			System.out.println("tu numero es impar");
			}
				
			// PRIMO | NO PRIMO
				
			while ((comprobante) &&  contador != num1) {
					
			if (num1 % contador == 0)
						
				comprobante = false;
						
					contador++; }
					
			if (comprobante == false) {
			System.out.println("tu número no es primo");
			}
				
			if (comprobante == true) {
			System.out.println("tu número es primo");
			}
				
			// MULTIPLO DE 7
			respuesta = num1;
				 
			if (num1 % multiplo == 0) {
			System.out.println("tu numero es multiplo de 7");
			}
				 	
			else if (num1 % multiplo != 0) {
			System.out.println("tu numero no es multiplo de 7");
			}
	}	
}