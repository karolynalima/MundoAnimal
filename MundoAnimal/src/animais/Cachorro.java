package animais;

import classes.Mamifero;
import especies.Viviparo;
import familia.Matilha;
import grupoalimentos.Carnivoro;
import grupos.Terrestre;

public class Cachorro  extends Mamifero implements Viviparo,Matilha,Terrestre,Carnivoro{

	public Cachorro(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Cachorro");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d anos \n", idade);
		System.out.printf("Comprimento: %.2fm \n", comprimento);
		System.out.printf("Peso: %.1fkg \n", peso);
		
		
		
		gestaçao();
		conceber();
		latir();
		andar();
		alimentar();
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentação:Ração, Carnes");
	}

	@Override
	public void andar() {
		System.out.println("Movimentação: Caminhando");
	}

	@Override
	public void latir() {
		System.out.println("Comunicação: Latindo");
	}

	@Override
	public void gestaçao() {
		System.out.println("Gestaçao: Desenvolvimento embrionário na placenta em média geral de 63 Dias");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber: Dar a luz ao feto gerado e desenvolvido no periodo de gestaçao");
	}

}
	
	
	


