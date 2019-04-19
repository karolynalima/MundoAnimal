package animais;

import classes.Mamifero;
import especies.Viviparo;
import familia.Felino;
import grupoalimentos.Carnivoro;
import grupos.Terrestre;

public class Gato extends Mamifero implements Viviparo,Felino,Terrestre,Carnivoro {

	public Gato(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Animal: Gato");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Idade: %d anos \n", idade);
		System.out.printf("Comprimento: %.2fm \n", comprimento);
		System.out.printf("Peso: %.1fkg \n", peso);
		
		
		
		gesta�ao();
		conceber();
		comunicar();
		andar();
		alimentar();
	}

	@Override
	public void alimentar() {
		System.out.println("Alimenta��o:leite, ra��o, Carnes");
	}

	@Override
	public void andar() {
		System.out.println("Movimenta��o: Caminhando");
	}

	@Override
	public void comunicar() {
		System.out.println("Comunica��o: Miado");
	}

	@Override
	public void gesta�ao() {
		System.out.println("Gesta�ao: Desenvolvimento embrion�rio na placenta em m�dia geral de 65 Dias");
	}

	@Override
	public void conceber() {
		System.out.println("Conceber: Dar a luz ao feto gerado e desenvolvido no periodo de gesta�ao");
	}
}


