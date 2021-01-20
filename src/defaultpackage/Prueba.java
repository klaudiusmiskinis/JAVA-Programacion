package defaultpackage;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Prueba {

	public static void main(String[] args) {

		//INICIALIZAMOS
		Scanner reader = new Scanner(System.in);
		String string = "";
		System.out.println("Introduce tu string");
		string = reader.nextLine();
		string = string.toLowerCase();
		if (string.contains("a") && (string.contains("e"))&& (string.contains("i")) && (string.contains("o")) && (string.contains("u"))) {
			System.out.println("Pentavocalica");
		}
		




	}
}