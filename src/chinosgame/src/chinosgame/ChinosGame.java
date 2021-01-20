package chinosgame;
import java.util.*;
public class ChinosGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner (System.in);
		Random naleatorio=new Random();
		
		int J1=0;
		int J2=0;
		int SJ1=0;
		int SJ2=0;
		int AJ1=0;
		int AJ2=0;
		int partidas=0;
		int contadorp=0;
		boolean reiniciar=true;
		String qhacer = "N";
		
		do {
			System.out.println("Bienvenido al juego de los chinos!");
			System.out.println("Cuantas partidas quieres jugar?");
			partidas=reader.nextInt();
			while(contadorp<partidas) {
				if(contadorp==0) {
					System.out.println("Comenzemos...");
				}
				System.out.print("Elige un numero entre 1-3:");
				SJ1=reader.nextInt();
				SJ2=naleatorio.nextInt(4);
				while(SJ1<0 || SJ1>3) {
					System.out.println("Error...");
					System.out.print("Porfavor.Elige un numero entre 0-3:");
					SJ1=reader.nextInt();
				}
				System.out.print("Cual es tu apuesta?:");
				AJ1=reader.nextInt();
				AJ2=naleatorio.nextInt(6);
				while(SJ1<0 || SJ1>3) {
					System.out.println("Error...");
					System.out.print("Porfavor.Elige un numero entre 0-6:");
					SJ1=reader.nextInt();
				}
				if(AJ1==SJ1+SJ2) {
					System.out.println("Has acertado!");
					J1++;
				}else {
					System.out.println("No has acertado!");
				}
				if(AJ2==SJ1+SJ2) {
					System.out.println("La maquina ha acertado!");
					J2++;
				}else {
					System.out.println("La maquina no ha acertado!");
				}
				contadorp++;
			}
			System.out.print("Quieres volver a jugar?(S/N):");
			qhacer=reader.next();
			while(qhacer!="N" || qhacer!="n"|| qhacer!="S"|| qhacer!="s") {
				System.out.println("Error...");
				System.out.print("Porfavor.escoge 'S' o 'N' :");
				qhacer=reader.next();
			}
			if(qhacer.equals('N')||qhacer.equals('n')){
				reiniciar=false;
			}
				
			
		}while(reiniciar==true);
	}

}
