import java.util.Scanner;

public class Exercici {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		//EJERCICIO1
		/*

		double r = 0;
		double perimetro, area;
		perimetro = 2*Math.PI*r;
		area = Math.PI*r*r;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el radio del circulo");

		r = reader.nextDouble();

		System.out.println("El perimetro del circulo es: "  + 2*Math.PI*r);
		System.out.println("El perimetro del circulo es: "  + Math.PI*r*r);
		 */

		//EJERCICIO 2

		/*
		Scanner reader = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int suma = num1 + num2;
		int producto = num1 * num2;
		int resta = num1 - num2;
		int resto = num1 % num2;

		System.out.println("Introduce tu primer numero");
		num1 = reader.nextInt();

		System.out.println("Introduce tu segundo numero");
		num2 = reader.nextInt();

		System.out.println("La suma es: " +suma);
		System.out.println("La suma es: " +producto);
		System.out.println("La suma es: " +resta);
		System.out.println("La suma es: " +resto);
		 */

		//EJERCICIO 3

		/*
		 Scanner reader = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int media = 0;

		System.out.println("Introduce tu primer número");
		num1 = reader.nextInt();
		System.out.println("Introduce tu segundo número");
		num2 = reader.nextInt();
		System.out.println("Introduce tu tercer número");
		num3 = reader.nextInt();

		media = num1 + num2 + num3;

		System.out.println("La media es: " + media / 3);
		 */

		//EJERCICIO 4

		/*
		System.out.println("Introduce el número");
		num1 = reader.nextInt();

		if (num1 > 10) {
		System.out.println("El numero es mayor que 10");
		} else if (num1 < 10) {
				System.out.println("El numero es menor que 10");
		} else {
			System.out.println("El numero es igual a 10");
		 */

		//EJERCIO 5

		/*
		Scanner reader = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.println("Introduce tu primer numero");
		a = reader.nextInt();

		System.out.println("Introduce tu primer numero");
		b = reader.nextInt();

		if (a > b) {
			System.out.println("A es mayor que B");
		} else if (a < b) {
			System.out.println("A es menor que B");
		} else {
			System.out.println("A es igual a B");
		}
		 */

		//EJERCICIO 6

		/*
		int a = 0;
		int b = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce tu primer número");
		a = reader.nextInt();

		System.out.println("Introduce tu segundo número");
		b = reader.nextInt();

		int ab = a + b;

		if (ab > 0) {
			System.out.println("Tu número es positivo "+ab);
		} else if (ab < 0) {
			System.out.println("Tu numero es negativo "+ab);
		} else {
			System.out.println("Tu numero es cero" +ab);
		}
		 */

		//EJERCICIO 7

		/*
		int a = 0;
		int b = 0;

		System.out.println("Introduce tu primer número");
		a = reader.nextInt();
		System.out.println("Introduce tu segundo número");
		b = reader.nextInt();

		if (a >= 0 || b >= 0) {
			System.out.println("OK");
		} else if  (a >= 0) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		 */

		//EJERCICIO 8

		/*
		int nota = 0;
		int edad = 0;
		char carnet;
			carnet = 'S';
			carnet = 'N';

		System.out.print("Introduce tu nota");
		nota = reader.nextInt();

		System.out.print("Introduce tu edad");
		edad = reader.nextInt();

		System.out.print("Introduce la letra de tu carnet");
		carnet = reader.next().charAt(0);

		if (nota >= 0 && edad >= 18 && carnet == 'S') {
			System.out.print("ACEPTADA");

		} else if (nota >= 0 && edad >= 18 && carnet == 'N') {
				System.out.println("POSIBLE");
			}
		 */

		// EJERCICIO 9

		/*
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.println("Introduce tus 3 numeros");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		num3 = reader.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.print("El orden de los numeros es: "+num1+ ">" +num2+ ">" +num3);
		} else if (num1 < num2 && num2 < num3) {
			System.out.print("El orden de los numeros es: "+num3+ ">" +num2+ ">" +num1);
		}

		if (num1 < num2 && num2 > num3 && num3 > num1) {
			System.out.print("El orden de los numeros es: "+num2+ ">" +num3+ ">" +num1);
		} else if (num3 > num1 && num2 < num3 && num2 < num1) {
			System.out.print("El orden de los numeros es: "+num3+ ">" +num1+ ">" +num2);
		}

		if (num1 < num2 && num2 > num3 && num3 < num1) {
			System.out.print("El orden de los numeros es: "+num2+ ">" +num1+ ">" +num3);
		} else if (num1 > num3 && num2 < num3 && num2 < num1) {
			System.out.print("El orden de los numeros es: "+num1+ ">" +num3+ ">" +num2);
		}
		 */

		//EJERCICIO 10

		/*
		int a,b,c,d,e = 0;

		System.out.println("Introduce los 5 números");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		d = reader.nextInt();
		e = reader.nextInt();
		int media = (a+b+c+d+e)/5;
		//Suma de media y print en pantalla de los resultados
		System.out.println("La media es: "+media );
		if (a > media && a > b) {
			System.out.println("El número "+a+" es mayor que la media");
		} if (b > media) {
			System.out.println("El número "+b+" es mayor que la media");
		} if (c > media) {
			System.out.println("El número "+c+" es mayor que la media");
		} if (d > media) {
			System.out.println("El número "+d+" es mayor que la media");
		} if (e > media) {
			System.out.println("El número "+e+" es mayor que la media");
		}
		 */

		//EJERCICIO 11

		/*
		double mensual = 0;
		double pagas = 0;

		System.out.println("Introduzca su salario mensual");
		mensual = reader.nextInt();
		System.out.println("Introduzca su numero de pagas");
		pagas = reader.nextInt();

		double anual = mensual*pagas;

		if (anual < 1000000) {
			System.out.println("El impuesto a pagar es 5%: " +anual*0.05);
		} else if (anual > 1000000 && anual < 2500000) {
			System.out.println("El impuesto a pagar es 12%: " +anual*0.12);
		} else if (anual > 2500001 && anual < 3800000) {
			System.out.println("El impuesto a pagar es 15%: " +anual*0.15);
		} else if (anual > 3800001 && anual < 6000000) {
			System.out.println("El impuesto a pagar es 22%: " +anual*0.22);
		} else {
			System.out.println("El impuesto a pagar es 30%: " +anual*0.30);
		}
		 */

		//FOR/WHILE
		//EJERCICIO 12

		/*
		System.out.println("Introduce tu número");
		int i = 0;
		i = reader.nextInt();
		while (i > 0) {
			System.out.println("Introduce otro número");
			i = reader.nextInt();
		} if (i == 0) {
			System.out.println("El número es 0"); 
		} else if (i < 0) {
			System.out.print("Tu número es un numero negativo");
		}
		 */

		//EJERCICIO 13

		/*
		int i = 0;
		System.out.println("Introduce tu número");
		i = reader.nextInt();
		while (i >= 100) {
			System.out.println("Introduce otro número");
			i = reader.nextInt();
		}
		if (i < 100) {
			System.out.println("Tu número es menor que 100");
		} else if (i < 0) {
			System.out.println("Tu número es un numero negativo");
		}
		 */

		//EJERCICIO 14

		/*
		int i = 0;
		int contador = 0;
		System.out.println("Introduce tu numero");
		i = reader.nextInt();
		while (i >= 0) {
			System.out.println("Introduce otro numero");
			i = reader.nextInt();
			contador++;
		}
		if (i < 0) {
			System.out.println("El numero es negativo");
			System.out.println("Has introducido números "+contador+" vez/veces");
		}
		 */

		//EJERCICIO 15 ¡NO FUNCIONA!

		/*
		int i = 0;
		int o = 0;
		System.out.println("Introduce tu primer numero");
		i = reader.nextInt();
		System.out.println("Introduce tu segundo numero");
		o = reader.nextInt();

		do {
			System.out.println("Introduce tu primer numero");
			i = reader.nextInt();
			System.out.println("Introduce tu segundo numero");
			o = reader.nextInt();
		} while (i==0 || o==0 || i==o); 
		if (i==o) {
			System.out.println("Ambos numeros son iguales");
		} else if (i==0 || o==0) {
			System.out.println("Uno de los dos numeros es 0");
		}
		 */

		//LIMPIAR BUFFER 
		/*
		 * (NombreDelEscaner).nextLine();
		 */

		//EJERCICIO 16 (NO TERMINADO)

		/*
		int num1 = 1;
		int contador = 0;
		int guardado = 0;
		int suma = 0;
		int media = 0;
		do {
			System.out.println("Introduce tu  numero");
			num1 = reader.nextInt();

		}	while (num1 > 0); {
			if (contador>=1) {
				for (int i=0; i<=num1;i++)
					guardado = suma + i;
			}
			contador++;
		}	
		media= guardado /contador;
		System.out.println("La media de tu numero es: "+media);
		 */

		//EJERCICIO 17

		/*
		char vocal;
		vocal = 'a';
		vocal = 'e';
		vocal = 'i';
		vocal = 'o';
		vocal = 'u';
		System.out.println("Introduce tu letra");
		vocal = reader.next().charAt(0);

		if (vocal == 'a' || vocal == 'e' || vocal == 'o'||vocal == 'i' || vocal == 'u') {
			System.out.println("VOCAL");
		} else {
			System.out.println("CONSONANTE");
		}
		 */

		//EJERCICIO 18

		/*
		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		int contador = 0;

		do {
			System.out.println("Introduce tu primer número");
			num1 = reader.nextInt();
			System.out.println("Introduce tu segundo número");
			num2 = reader.nextInt();
			if (contador == 0) {
				contador++;
			} else if (contador == 1) {
				suma = num1+num2;
				System.out.println("La suma de ambos numero es: "+suma+"\n");
			}

		} while (num1 !=0 || num2 != 0); {
			if (contador == 0) {
				suma = num1+num2;
				contador++;
				System.out.println("La suma de ambos numero es: "+suma);
			} else if (num1==0 || num2==0) {
				System.out.println("Uno de los dos numeros que has introducido es un 0");
			}
		}
		 */

		//EJERCICIO 19

		/*
		int num1 = 0;
		int contadorcinco = 0;
		int contadoronce = 0;
		int contadorfuera = 0;

		System.out.println("Introduce un numero");
		num1 = reader.nextInt();

		while (num1 > 0) {
			System.out.println("Introduce un numero");
			num1 = reader.nextInt();
			if (num1 >= 5 && num1 <= 10) {
				contadorcinco++;
			} else if (num1 >=11 && num1 <= 15) {
				contadoronce++;
			} else if (num1 > 0) {
				contadorfuera++;
			}
		}
		System.out.println("El numero que has introducido es negativo");
		System.out.println("Números que ha habido entre 5 y 10 han sido: "+contadorcinco);
		System.out.println("Numeros que ha habido entre 11 y 15 han sido: "+contadoronce);
		System.out.println("Otros numeros diferentes: "+contadorfuera);
		 */

		//EJERCICO 20 Y EJERCICIO 23 y EJERICICO 24

		/*
		int a=0;
		int b=0;
		System.out.println("Introduce el primer valor del intervalo");
		a=reader.nextInt();
		System.out.println("Introduce el segundo valor del intervalo");
		b=reader.nextInt();
		if (a>b) {
			for (int ab=0; a>b; b++) {
				System.out.println(" "+b+"");
			} 
		} else if (a<b) {
			for (int g=0; b>a; a++) {
				System.out.println(" "+a+"");
			}
		} else if (a==b) {
			System.out.println(+a+"\n"+b);
		}
		 */

		//EJERCICIO 21

		/*
		int a = 21;
		for (int b=1;a>b;b++) {
			System.out.println(+b);
		}
		 */

		//EJERCICIO 22

		/*
		 int a = 30;
		 for (int b=2; b<=30; b=b+2) {
			 System.out.print(" "+b+"");

		 */
		
		//EJERCICIO 25
		
		int a = 0;
		int b = 0;
		System.out.println("Introduce el primer numero");
		a = reader.nextInt();
		System.out.println("Introduce el segundo numero");
		b = reader.nextInt();
		
		for (int c; a > c; c++) {
			
		}
		
		
		
		
	}


}