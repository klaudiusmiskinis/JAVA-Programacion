// Dades per verificar les dades de l'arxiu hist.bin:
// Primer registre: 2017 10 24 25 31 32 36 48
// �ltim registre:  1985 3 11 13 15 34 35 27
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
// Si necessiteu alguna altra llibreria la podeu afegir

public class Cognom_ValidacioUF3 {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner ( System.in );
		//Els diferents fitxers que tenim
		// Les dades que estan guardades dins del fitxer hist.bin segueixen aquest format:
		//String int int int int int int int  -> sense espais 
		// Exemple 2016 8 12 25 27 29 35 42
		String FitxerHist = "C:/tmp/primhist.bin";
		
		// la variable apostes guardar� el total d'apostes que hi ha dins el fitxer XXXX.txt
		int resp = 0, opcion=0, apostes = 0; 
		
		
		while ( opcion != 5 ){
			System.out.println("1.Creacion Fitxer any XXXX.txt"); //5 punts
			System.out.println("3.Mostrar dades d'un any XXXX");//5 punts
			System.out.println("5.Sortir");
			System.out.print("Opcio: ");
			opcion = reader.nextInt();
			
			if ( opcion == 1 ){
			//ENUNCIAT1: A partir de l'arxiu hist.bin caldr� crear un nou arxiu XXXX.txt amb les dades de les 
			// apostes d'aquell any XXXX. L'any es demanar� desde el main() i es passar� a la funci� CreacioAny(), 
			// com un dels parametres d'entrada. Aquesta funci� retornara al main() la quantitat d'apostes processades
			// Aquesta informaci� es mostrara desde el main().	
			// Exemple: Si l'usuari entra l'any 2010, es generar� el fitxer 2010.txt amb les dades de totes les apostes
			// d'aquest any, i mostrara per pantalla: "S'han processat 104 apostes durant l'any 2010."	
				
			System.out.println("¿De que año quieres guardar las apuestas?");
			resp = reader.nextInt();
			CreacionAnno(FitxerHist, resp);
			
			}else if ( opcion == 3 ){
			//ENUNCIAT3: Aquesta opci� demanara a l'susari que entri un any XXXX. Desde la funci� MostrarDades() ens mostrara
			// les dades de totes les apostes de l'any demanat llegint-les de l'arxiu XXXX.txt (Creat en el punt 1).
			// Si de l'any demanat per l'usuari no existeix l'arxiu, 
			// mostrara per pantalla "dades no existents per l'any XXXX" des del main().	
			System.out.println("De que año quieres ver las apuestas");
			resp = reader.nextInt();
			getDatos(resp);
				
			}else if ( opcion == 5 ){
				System.out.println();
				System.out.println("Enhorabona, Heu acabat la prova de validaci� de la darrera UF d'aquest m�dul!!!!");
			}else {
				resp++;
				if(resp == 1)System.out.println("You have chosen an invalid option. For some reason?");
				else if (resp == 2)System.out.println("You have chosen an invalid option for the second time!!!!");
				else System.out.println("We recommend you take the online course:Why do you have ten fingers in your hands?");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
	public static void getDatos(int resp) throws IOException {
		String fitx = "C:/tmp/"+resp+".txt";
		
		String datos = "";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fitx);
			br = new BufferedReader(fr);
			
			do {
				datos = br.readLine();
				System.out.println(datos);
			} while (datos != null);
			
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			fr.close();
			br.close();
		}
	}
	
	public static void CreacionAnno(String fit, int any) throws IOException {
		
		int ap = 0;
		String a = "";
		String result = "C:/tmp/"+any+".txt";
		int a1, a2, a3, a4, a5, a6, a7;
		
		DataInputStream read = null;
		FileWriter write = new FileWriter(result, false);
		BufferedWriter bw = new BufferedWriter(write);
		
		
		try {
			read = new DataInputStream(new FileInputStream(fit));
			do {
				a = read.readUTF();
				a1 = read.readInt();
				a2 = read.readInt();
				a3 = read.readInt();
				a4 = read.readInt();
				a5 = read.readInt();
				a6 = read.readInt();
				a7 = read.readInt();
				
				if(a.equals(Integer.toString(any))) {
					bw.write(a + " " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7);
					bw.newLine();
					ap++;
				}
			} while (true);
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		} finally {
			read.close();
			bw.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
}