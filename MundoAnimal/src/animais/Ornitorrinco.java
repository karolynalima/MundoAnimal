package animais;

import classes.Mamifero;
import especies.Oviparo;
import familia.Monotremata;
import grupoalimentos.Carnivoro;
import grupos.Aquatico;
import grupos.Terrestre;

public class Ornitorrinco extends Mamifero implements Oviparo,Monotremata,Aquatico,Terrestre,Carnivoro {

	public Ornitorrinco(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Ornitorrinco");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d anos \n", idade);
		System.out.printf("Comprimento: %.2fm \n", comprimento);
		System.out.printf("Peso: %.1fkg \n", peso);
		
		
		
		gestaçao();
		conceber();
		comunicar();
		andar();
		nadar();
		alimentar();
		
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentação: Custaceos de Água doce, insetos");
	}

	@Override
	public void andar() {
		System.out.println("Movimentação-Terra: Passos desajeitados em terra");
	}

	@Override
	public void nadar() {
		System.out.println("Movimentação-Água: Nado Razoavel");
	}

	@Override
	public void comunicar() {
		System.out.println("Comunicação: Grunhidos");
	}

	@Override
	public void gestaçao() {
		System.out.println("Gestação: Desenvolvimento embrionário em Ovo no periodo de 10 à 14 Dias");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber:feto gerado e desenvolvido na gestaçao");
	}
	
}
	
	


