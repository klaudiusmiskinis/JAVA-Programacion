// GIP: Gesti� Inteligent Primitives
// Dades per verificar les dades de l'arxiu hist.bin:
// Primer registre: 2017 10 24 25 31 32 36 48
// �ltim registre:  1985 3 11 13 15 34 35 27
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
// Si necessiteu alguna altra llibreria la podeu afegir

public class Barbe_ValidacioUF4 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		// Els diferents fitxers que tenim
		// Les dades que estan guardades dins del fitxer hist.bin segueixen aquest
		// format:
		// String int int int int int int int -> sense espais
		// Exemple 2016 8 12 25 27 29 35 42
		String FitxerHist = "C:/tmp/primhist.bin";

		// la variable apostes guardar� el total d'apostes que hi ha dins el fitxer
		// XXXX.txt
		int resp = 0, opcion = 0, apostes = 0, any = 0;

		while (opcion != 5) {
			System.out.println("1.Creaci� Fitxer any XXXX.txt"); // 5 punts
			System.out.println("3.Mostrar dades d'un any XXXX");// 5 punts
			System.out.println("5.Sortir");
			System.out.print("Opcio: ");
			opcion = leer.nextInt();

			if (opcion == 1) {
				// ENUNCIAT1: A partir de l'arxiu hist.bin caldr� crear un nou arxiu XXXX.txt
				// amb les dades de les
				// apostes d'aquell any XXXX. L'any es demanar� desde el main() i es passar� a
				// la funci� CreacioAny(),
				// com un dels parametres d'entrada. Aquesta funci� retornara al main() la
				// quantitat d'apostes processades
				// Aquesta informaci� es mostrara desde el main().
				// Exemple: Si l'usuari entra l'any 2010, es generar� el fitxer 2010.txt amb les
				// dades de totes les apostes
				// d'aquest any, i mostrara per pantalla: "S'han processat 104 apostes durant
				// l'any 2010."

				// AQUI HI VA EL VOSTRE CODI FONT
				try {
					do {
						System.out.println("De quin any vols veure les apostes? ");
						any = leer.nextInt();
					} while (any < 0 || any > 2020);
					apostes = CreacioAny(any, FitxerHist);
				} catch (IOException e) {
					System.out.println("Error E/S: " + e);
				} catch (InputMismatchException e) {
					System.out.println("Error, caracter no valido " + e);
				}

				System.out.println("S'han processat " + apostes + " apostes durant l'any" + any);

			} else if (opcion == 3) {
				// ENUNCIAT3: Aquesta opci� demanara a l'susari que entri un any XXXX. Desde la
				// funci� MostrarDades() ens mostrara
				// les dades de totes les apostes de l'any demanat llegint-les de l'arxiu
				// XXXX.txt (Creat en el punt 1).
				// Si de l'any demanat per l'usuari no existeix l'arxiu,
				// mostrara per pantalla "dades no existents per l'any XXXX" des del main().

				// AQUI HI VA EL VOSTRE CODI FONT
				try {
					do {
						System.out.println("Introdueix un any: ");
						any = leer.nextInt();
					} while (any < 0 || any > 2020);
					MostrarDades(any);
				} catch (IOException e) {
					System.out.println("Error E/S: " + e);
				} catch (NullPointerException e) {
					System.out.println("Dades no existents per l'any " + any);
				}

			} else if (opcion == 5) {
				System.out.println();
				System.out.println("Enhorabona, Heu acabat la prova de validaci� de la darrera UF d'aquest m�dul!!!!");
			} else {
				resp++;
				if (resp == 1)
					System.out.println("You have chosen an invalid option. For some reason?");
				else if (resp == 2)
					System.out.println("You have chosen an invalid option for the second time!!!!");
				else
					System.out.println(
							"We recommend you take the online course:Why do you have ten fingers in your hands?");
			}
			System.out.println();
			System.out.println();
		}

		leer.close();
	}

	// AQUI HI VAN LES DIFERENTS FUNCIONS QUE CREAREU

	/************************************************************************************
	 * Funció: CreacioAny Explicació que fa aquesta funció: llegeix les dades del
	 * arxiu .bin i guarda en un .txt els resultats de l'any seleccionat Paràmetres
	 * entrada: int any, String fitxerHist sortida: int apostes
	 ************************************************************************************/
	public static int CreacioAny(int any, String fitxerHist) throws IOException {
		int apostes = 0;
		String anyString = "";
		String resultat = any + ".txt";
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0;

		DataInputStream leeFicheroBin = null;
		FileWriter fw = new FileWriter(resultat, false);
		BufferedWriter bw = new BufferedWriter(fw);

		try {
			leeFicheroBin = new DataInputStream(new FileInputStream(fitxerHist));
			do {
				anyString = leeFicheroBin.readUTF();
				a1 = leeFicheroBin.readInt();
				a2 = leeFicheroBin.readInt();
				a3 = leeFicheroBin.readInt();
				a4 = leeFicheroBin.readInt();
				a5 = leeFicheroBin.readInt();
				a6 = leeFicheroBin.readInt();
				a7 = leeFicheroBin.readInt();

				if (anyString.equals(Integer.toString(any))) {
					bw.write(anyString + " " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7);
					bw.newLine();
					apostes++;
				}

			} while (true);

		} catch (EOFException e) {
			System.out.println("Fi del fitxer.");
		} catch (IOException e) {
			System.out.println("Error E/S" + e);
		} finally {
			leeFicheroBin.close();
			bw.close();
		}

		return apostes;
	}

	/************************************************************************************
	 * Funció: MostrarDades Explicació que fa aquesta funció: mostra les dades del
	 * fitxer del any seleccionat Paràmetres entrada: int any sortida:void
	 ************************************************************************************/
	private static void MostrarDades(int any) throws IOException {
		String fitxer = any + ".txt";

		String dades = "";// recull les dades del fitxer per mostrarles per pantalla
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fitxer);
			br = new BufferedReader(fr);

			do {
				dades = br.readLine();
				System.out.println(dades);
			} while (dades != null);

		} catch (IOException e) {
			System.out.println("Error E/S" + e);
		} finally {
			// Cerrar el fichero
			fr.close();
			br.close();

		}

	}

}