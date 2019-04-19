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
		
		
		
		gesta�ao();
		conceber();
		comunicar();
		andar();
		nadar();
		alimentar();
		
	}

	@Override
	public void alimentar() {
		System.out.println("Alimenta��o: Custaceos de �gua doce, insetos");
	}

	@Override
	public void andar() {
		System.out.println("Movimenta��o-Terra: Passos desajeitados em terra");
	}

	@Override
	public void nadar() {
		System.out.println("Movimenta��o-�gua: Nado Razoavel");
	}

	@Override
	public void comunicar() {
		System.out.println("Comunica��o: Grunhidos");
	}

	@Override
	public void gesta�ao() {
		System.out.println("Gesta��o: Desenvolvimento embrion�rio em Ovo no periodo de 10 � 14 Dias");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber:feto gerado e desenvolvido na gesta�ao");
	}
	
}
	
	


