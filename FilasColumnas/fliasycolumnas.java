package filasycolumnas;
import java.util.*;
public class fliasycolumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int filas=0;
		int columnas=0;
		int counter=0;
		int ccolumnas=0;
		boolean stop=false;

		System.out.print("Intoduce el numero de filas: ");
		filas=reader.nextInt();
		System.out.print("Introduce el numero de columnas: ");
		columnas=reader.nextInt();
		if(filas>10 || columnas>10) {
			System.out.println("Error. Porfavor introduce numeros por debajo o igual que 10.");
			fliasycolumnas.main(null);
		}
	
		
		if(filas==0 || columnas==0) {
			stop=true;
		}
		while(stop=false || counter!=filas*columnas) {
			System.out.print(" "+counter);
			counter++;
			if(counter==filas) {
				System.out.print("\n");
			}
		}
	}

}
