package animais;

import classes.Ave;
import especies.Oviparo;
import familia.Passaro;
import grupoalimentos.Onivoro;
import grupos.Voa;

public class Flamingo extends Ave implements Oviparo,Passaro,Voa,Onivoro{

	public Flamingo(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Flamingo");
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
		System.out.println("Alimenta��o: algas e camar�es");
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
		System.out.println("Gesta�ao:  incubam por um per�odo de 27 a 31 dias.");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber:s� colocam um �nico ovo no ninho de lama e os");
	}

}

