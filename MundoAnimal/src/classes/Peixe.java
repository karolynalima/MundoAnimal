package classes;

public abstract class Peixe extends Animais {
	
	public Peixe(String nome, int idade, double comprimento, double peso) {
		super(nome, idade, comprimento, peso);
		
		System.out.println("Classe: Peixe");
	}

}
