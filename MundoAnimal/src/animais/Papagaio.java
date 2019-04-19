package animais;

import classes.Ave;
import especies.Oviparo;
import familia.Passaro;
import grupoalimentos.Onivoro;
import grupos.Voa;

public class Papagaio extends Ave implements Oviparo,Passaro,Voa,Onivoro{
	
	public Papagaio(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Papagaio");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d anos \n", idade);
		System.out.printf("Altura: %.2fm \n", comprimento);
		System.out.printf("Peso: %.1fkg \n", peso);
		
		
		gesta�ao();
		conceber();
		comunicar();
		voar();
		alimentar();
		
	}
	@Override
	public void alimentar() {
		System.out.println("Alimenta��o: Frutas, Sementes");
	}

	@Override
	public void voar() {
		System.out.println("Movimenta��o: Voando");
	}

	@Override
	public void comunicar() {
		System.out.println("Comunica��o: " + "\"Cantando\"");
	}

	@Override
	public void gesta�ao() {
		System.out.println("Gesta�ao: varia de 24 a 28 dias");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber:  Fazem postura de tr�s a quatro ovos");
	}

}



