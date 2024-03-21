package Scacchi;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Gioco gioco = new Gioco();
			
			while(true) {
				System.out.println("Cosa vuoi fare?");
				System.out.println("START,: comincia partita");
				System.out.println("INSERT , NOME, COGNOME");
				System.out.println("SHOW,: stampa la scacchiera");
				System.out.println("MOVE, RIGAOR, COLONNAOR, RIGADEST, COLONNADEST");//origine e destinazione
				
				String input = sc.nextLine();
				String[] splittedInput = input.split(",");
				if(splittedInput[0].equals("START")){
					//CODE FOR START
				}
				else if(splittedInput[0].equals("INSERT")) {
					//CODE FOR INSERT
				}
				else if(splittedInput[0].equals("SHOW")) {
					//CODE FOR SHOW
				}
				else if(splittedInput[0].equals("MOVE")) {
					//CODE FOR MOVE
				}
			}
		}
}
