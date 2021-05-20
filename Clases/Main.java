package Clases;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Entrenador entrenadorU = new Entrenador(001,"Jose", "Guardian", 34, "X0001");
		Futbolista futU = new Futbolista(010, "Lionel", "Cristiano", 32, 10, "Paquistani");
		Futbolista futD = new Futbolista(011, "Kung", "Fu", 28, 9, "Chino");
		Fisio fisioU = new Fisio(002, "Francisco", "Masajes", 24, "Titulado experto en masajes", 5);
		Jefe_de_prensa jefeU = new Jefe_de_prensa(003, "Paquito", "Chocolatero", 44, "Marca");
		
		
		
		futU.concentrarse();
		futU.entrenar();
		futU.jugarPartido();
		futU.viajar();
		
		entrenadorU.dirigirEntrenamiento();
		entrenadorU.dirigirPartido();
		
		fisioU.darMasaje();
		
		jefeU.accion();
	}
	
}
