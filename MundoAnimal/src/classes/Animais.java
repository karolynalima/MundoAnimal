package classes;

public abstract class Animais {
	
	private String nome;
	private double peso;
	private int idade;
	private double comprimento;
	
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	public double getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public double getComprimento() {
		return this.comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	public Animais(String nome, int idade, double comprimento, double peso) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setComprimento(comprimento);
		this.setPeso(peso);
	}
}


