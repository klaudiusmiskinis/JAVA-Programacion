import java.util.Random;
import java.util.Scanner;

public class FuncionesDia {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Random ran = new Random();
		
		int numDia = 0;
		String palabra = "";
		System.out.println("Introduce un número");
		numDia = reader.nextInt();
		palabra = diaSemana(numDia);
		System.out.println("El número del día es un "+palabra);
		
	}

	public static String diaSemana(int i){
		
		String dia = "";
		
		//USO DEL SWITCH
		switch (i) {
		case 1: dia = "Lunes";
		break;
		case 2: dia = "Martes";
		break;
		case 3: dia = "Miércoles";
		break;
		case 4: dia = "Jueves";
		break;
		case 5: dia = "Viernes";
		break;
		case 6: dia = "Sabado";
		break;
		case 7: dia = "Domingo";
		break;
		default: dia = "día inválido";
		break;
		}
		
		return dia;
	}
	
	
}
		