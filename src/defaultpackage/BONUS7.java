package defaultpackage;
import java.util.Random;
import java.util.Scanner;

public class BONUS7 {

	//EJERCICIO 4 DE REPASO
	public static void main(String[] args) {

		// INICIALIZACIÓN
		Scanner reader = new Scanner (System.in);
		Random aleatorio = new Random();
		int partidas = 0;
		int cero = 1;
		int contadorPartidas = 0;
		int jugador = 0;
		int ia = 0;
		int piedra = 1;
		int papel = 2;
		int tijera = 3;
		int lagarto = 4;
		int spock = 5;
		int contador = 0;
		int contadorIa = 0;
		boolean si = true;

		// ENTRADA Y PROCESO
		do {
			System.out.println("Introduce el numero de partidas que deseas jugar");
			partidas = reader.nextInt();
		} while (partidas == cero);
		do {
			System.out.println("Escoge entre: \n 1 (Piedra) \n 2 (Papel) \n 3 (Tijera) \n 4 (Lagarto) \n 5 (Spock)");
			jugador = reader.nextInt();
			// Se le da valor +1 a la IA y se pone como numero máximo 5 al random que genere.
			ia = 1 + aleatorio.nextInt(5);

			// ELECCIÓN DE LA IA
			if (ia == piedra) {
				System.out.println("La IA ha escogido Piedra");
			} else if (ia == papel) {
				System.out.println("La IA ha escogido Papel");
			} else if (ia == tijera) {
				System.out.println("La IA ha escogido Tijeras");
			} else if (ia == lagarto) {
				System.out.println("La IA ha escogido Lagarto");
			} else if (ia == spock) {
				System.out.println("La IA ha escogido Spock");
			} 
			// EMPATE
			if (jugador == ia) {
				System.out.println("Empate");
			} 
			// PIEDRA
			if (jugador == piedra) {	
				if (ia == papel) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == tijera) {
					System.out.println("Has ganado");
					contador ++;
				} else if (ia == lagarto) {
					System.out.println("Has ganado");
					contador++;
				} else if (ia == spock) {
					System.out.println("Has ganado");
					contador++;
				}
				// PAPEL
			} else if (jugador == papel) {	
				if (ia == piedra) {
					System.out.println("Has ganado");
					contador ++;
				} else if (ia == tijera) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == lagarto) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == spock) {
					System.out.println("Has ganado");
					contador++;
				}
				// TIJERA
			} else if (jugador == tijera) {	
				if (ia == piedra) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == papel) {
					System.out.println("Has ganado");
					contador ++;
				} else if (ia == lagarto) {
					System.out.println("Has ganado");
					contador ++;
				} else if (ia == spock) {
					System.out.println("Has perdido");
					contadorIa ++;
				}
				// LAGARTO
			} else if (jugador == lagarto) {	
				if (ia == piedra) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == papel) {
					System.out.println("Has ganado");
					contador ++;
				} else if (ia == tijera) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == spock) {
					System.out.println("Has ganado");
					contador++;
				}
				// SPOCK
			} else if (jugador == spock) {	
				if (ia == piedra) {
					System.out.println("Has ganado");
					contador++;
				} else if (ia == papel) {
					System.out.println("Has perdido");
					contadorIa ++;
				} else if (ia == tijera) {
					System.out.println("Has ganado");
					contador++;
				} else if (ia == lagarto) {
					System.out.println("Has perdido");
					contadorIa ++;
				}
			} contadorPartidas++;
			// if en caso de que se alcance el numero de partidas que ha introducido el usuario
			if (partidas == contadorPartidas) {
				System.out.println("¿Deseas seguir jugando? Escribe true para seguir jugando o false para dejar de jugar.");
				si = reader.nextBoolean();
				if (si == true) {
					partidas = 1;
					contadorPartidas = 0;
					System.out.println("Introduce el numero de partidas");
					partidas = reader.nextInt();
				}
			}
			// Condicion del while en caso de qu el if de arriba se cumpla.
			// Resultados del usuario, maquina o empate.
		} while (si == true && partidas != cero); {
			System.out.println("Tu puntuación es: "+contador+"\n La puntuación de la IA es: "+contadorIa);
			if (contador > contadorIa) {
				System.out.println("Has ganado con "+contador+" puntos");
			} else if (contador < contadorIa) {
				System.out.println("Ha ganado la IA con "+contadorIa+" puntos");
			}
		}
	}
} 
