package Clases;

import java.util.Scanner;

public class StringBasic {
	//ATRIBUTOS
	public String password;

	//CONSTRUCTOR VACIO
	public StringBasic() {
		this.password = "";
	}

	//CONTRUCTOR QUE SE LE PASE UNA CADENA DE TEXTO
	public StringBasic(String password) {
		this.password = password;
	}

	//GETTER
	public String getPassword() {
		return this.password;
	}

	//SETTER
	public void setPassword(String password) {
		this.password = password;
	}


	//CONTADOR DE VOCALES
	public int vocales() {
		String a = this.password;
		int cont = 0;

		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'||
					a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
				cont++;
			}
		}
		return cont;
	}


	//CONTADOR DE CONSONANTES
	public int consonantes() {
		String a = this.password;
		int cont = 0;

		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != 'a' || a.charAt(i) != 'e' || a.charAt(i) != 'i' || a.charAt(i) != 'o' || a.charAt(i) != 'u'||
					a.charAt(i) != 'A' || a.charAt(i) != 'E' || a.charAt(i) != 'I' || a.charAt(i) != 'O' || a.charAt(i) != 'U' ||
					a.charAt(i) != '!' || a.charAt(i) != '@' || a.charAt(i) != '#' || a.charAt(i) != '·' || a.charAt(i) != '$' ||
					a.charAt(i) != '€' || a.charAt(i) != '%' || a.charAt(i) != '¬' || a.charAt(i) != '&' || a.charAt(i) != '/' ||
					a.charAt(i) != '¿' || a.charAt(i) != '(' || a.charAt(i) != ')' || a.charAt(i) != '=' || a.charAt(i) != '?' ||
					a.charAt(i) != '¡' || a.charAt(i) != '[' || a.charAt(i) != ']' || a.charAt(i) != '{' || a.charAt(i) != '}' ||
					a.charAt(i) != '_' || a.charAt(i) != '-' || a.charAt(i) != '.' || a.charAt(i) != ':' || a.charAt(i) != ',' ||
					a.charAt(i) != ';' || a.charAt(i) != '¨' || a.charAt(i) != '*' || a.charAt(i) != '^' || a.charAt(i) != '+' ||
					a.charAt(i) != 'º' || a.charAt(i) != '|' || a.charAt(i) != '"' || a.charAt(i) != 'ª') {
				cont++;
			}
		}
		return cont;
	}


	//CONTADOR DE NUMERO DE PALABRAS
	public int palabras() {
		String a = this.password;
		int cont = 0;

		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				cont++;
			}
		}
		return cont;
	}


	//CONTADOR DE CARACTERES ESPECIALES
	public int especiales() {
		String a = this.password;
		int cont = 0;

		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != '(' || a.charAt(i) != ')' || a.charAt(i) != '*' || a.charAt(i) != '+' || a.charAt(i) != ',' ||
					a.charAt(i) != '-' || a.charAt(i) != '-' || a.charAt(i) != '.' || a.charAt(i) != '/') {
				cont++;
			}
		}
		return cont;
	}


	//CONTADOR DE LETRA QUE INTORDUCE EL USUARIO
	public int caracterParametro() {
		Scanner reader = new Scanner(System.in);
		String a = this.password;
		String b = "";
		char letra = ' ';
		int cont = 0;

		System.out.println("Introduce la letra que deseas buscar");
		b = reader.nextLine();
		reader.close();
		b = b.toLowerCase();
		letra = b.charAt(0);
		a = a.toLowerCase();

		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == letra) {
				cont++;
			}
		}
		return cont;
	}


	//INVERTIR EL ORDEN DE LOS CARACTERES
	public String invertir() {
		String b = "";
		StringBuilder ab = new StringBuilder(this.password);

		b = ab.reverse().toString();

		return b;
	}


	//SUSTITUIR LOS CARACTERES POR ASTERISCOS
	public String asterisco() {
		String a = this.password;
		String b = "";

		for(int i = 0; i < a.length(); i++) {
			b = b + '*';
		}

		return b;
	}


	//SUSTITUIR CARACTERES DE CADENA POR LETRA DEL USUARIO
	public String sustituirLetraUser() {

		Scanner reader = new Scanner(System.in);
		String a = this.password;
		String b = "";
		char letra = ' ';

		System.out.println("Introduce la letra que deseas cambiar la cadena");
		b = reader.nextLine();
		reader.close();
		b = b.toLowerCase();
		letra = b.charAt(0);
		a = a.toLowerCase();

		for(int i = 0; i < a.length(); i++) {
			b = b + letra;
		}

		return b;
	}
}
