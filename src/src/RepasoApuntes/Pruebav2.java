package RepasoApuntes;

import java.util.Scanner;

public class Pruebav2 {
	
    public static void main(String[] args) {

    	//variables
        int[] freqa = new int[80];  
        // para bucle
        int i = 0; 
        int j = 0;
        // para hacer la comprobacion de datos
        int comprobara = 0;
        int comprobarb = 0;
        // los sttring
    	String cadenaA = " ";  
    	String cadenaB = " "; 
    	// Iniciamos el escaner
        Scanner sc = new Scanner(System.in);

        // introducimos los datos
        System.out.println("Introduce la primera cadena de palabras");
        cadenaA = sc.nextLine(); 
        cadenaA.toLowerCase();
        // creamos el primer array de char
        char stringa[] = cadenaA.toCharArray();
        // comprobamos los datos
        while(stringa[(stringa.length-1)]!= '#' && stringa.length <80) {

        	for(i = 0;i < stringa.length;i++) {
                if(stringa[i] == '#') {
                }
                comprobara++;
        	}
        	System.out.println("No se ha encontrado un # por favor introduce otra vez la cadena de palabras");
        	cadenaA = sc.nextLine();
        	cadenaA.toLowerCase();
        	stringa = cadenaA.toCharArray();
        }
        // introducimos los datos
        System.out.println("Introduce la segunda cadena de palabras");
        cadenaB = sc.nextLine(); 
        cadenaB.toLowerCase();
        // creamos el segundo array de char
        char stringb[] = cadenaB.toCharArray();
        // comprobamos los datos
        while(stringb[(stringb.length-1)]!= '#' && stringb.length <25) {
        	for(i = 0;i < stringb.length;i++) {
                if(stringb[i] == '#') {
                }
                comprobarb++;
        	}
        	System.out.println("No se ha encontrado un # por favor introduce otra vez la cadena de palabras");
        	cadenaB = sc.nextLine();
        	cadenaB.toLowerCase();
        	stringb = cadenaB.toCharArray();
        }
        // contamos las veces que se repiten las letras
        
        for(i = 0; i < cadenaB.length();i++) {
        	for(j = 0; j < cadenaA.length();j++) {
        		if (stringb[i] == stringa[j]){
        			freqa[i] ++; 
        		}
        	}
        }
        // Mostramos por pantalla las letras que se repiten
        System.out.println("Las letras y las veces que se repiten");  
        for(i = 0; i < freqa.length; i++) {  
            if((stringb[i] != '#' && stringb[i] != ' ') && freqa[i] != '0') {  
                System.out.println(stringb[i] + " - " + freqa[i]);  
            }
        }  
       System.out.println("Fin del programa");  
       sc.close();
    }  
}