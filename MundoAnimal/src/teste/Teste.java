package teste;

import java.util.Scanner;

import animais.Cachorro;
import animais.Flamingo;
import animais.Gato;
import animais.Golfinho;
import animais.Ornitorrinco;
import animais.Papagaio;
import classes.Animais;

public class Teste {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		
		do {
			System.out.println("Escolha um Numero:");
			System.out.println("1.Flamingo; 2.Gato; 3.Cachorro; 4.Papagaio; 5.Golfinho; 6.Ornitorrinco");
															
			System.out.print("0.Sair; -> ");
			cont = scan.nextInt();
			System.out.println();
			
			switch(cont){
				case 1:
					Animais flamingo = new Flamingo("Flamingo", 40, 190, 2.3);
					System.out.println();
					break;
				case 2:
					Animais gato = new Gato("Gato", 20, 0.55, 4.50);
					System.out.println();
					break;
				case 3:
					Animais cachorro = new Cachorro("Cachorro", 15, 2.10, 60);
					System.out.println();
					break;
				case 4:
					Animais papagaio = new Papagaio("Papagaio", 100, 0.40, 0.400);
					System.out.println();
					break;
				case 5:
					Animais golfinho = new Golfinho("Golfinho", 35, 3.50, 110);
					System.out.println();
					break;
				case 6:
					Animais ornitorrinco = new Ornitorrinco("Ornitorrinco", 12, 0.80, 1.70);
					System.out.println();
					break;
				
			}
			
		} while(cont != 0);
		
	}

}


