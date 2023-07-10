package exercicio3_alturas;

public class Pessoas {
	
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoas(String nome, int idade, float altura) {
		this.nome = nome;
		this.setIdade(idade);
		this.setAltura(altura);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	

}
