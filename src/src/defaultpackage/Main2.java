package defaultpackage;
import java.util.Random;
import java.util.Scanner;



public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena1 = "";
		String cadena2 = "";
		char [] array1 = new char[2];
		char [] array2 = new char[2];
		int resultado = 0;
		
		System.out.println("Introduce la cadena 1");
		cadena1 = sc.nextLine();
		array1 = cadena1.toCharArray();
		
		System.out.println("Introduce la cadena 2");
		cadena2 = sc.nextLine();
		array2 = cadena2.toCharArray();
		
		resultado=comparar(array1, array2);
		System.out.println(resultado);
	}
	public static int comparar(char a[], char b[]) {
		int num = 0;
		if (a.length < b.length) {
			num = -1;
		} else if (a.length > b.length) {
			num = 1;
		} else {
			num = 0;
		}
		return num;
	}
}