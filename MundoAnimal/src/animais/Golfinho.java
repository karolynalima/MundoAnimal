package animais;

import classes.Peixe;
import especies.Viviparo;
import familia.Delphinidae;
import grupoalimentos.Mamifero;
import grupos.Aquatico;

public class Golfinho extends Peixe implements Viviparo,Delphinidae,Aquatico,Mamifero {

	

	public Golfinho(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Golfinho");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d anos \n", idade);
		System.out.printf("Comprimento: %.2fm \n", comprimento);
		System.out.printf("Peso: %.1fkg \n", peso);
		
		
		
		gestaçao();
		conceber();
		comunicar();
		nadar();
		alimentar();
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentação: peixes e lulas");
	}

	@Override
	public void nadar() {
		System.out.println("Movimentação: Nadando com auxilio de nadadeiras e barbatanas");
	}

	@Override
	public void comunicar() {
		System.out.println("Comunicação: biossonar");
	}

	@Override
	public void gestaçao() {
		System.out.println("Gestaçao: dão à luz um filhote de cada vez,  entre os 10 e os 12 meses");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber: Dar a luz um filhote por vez");
	}


}
