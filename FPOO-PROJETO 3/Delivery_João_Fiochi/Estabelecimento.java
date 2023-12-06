package Delivery_João_Fiochi;

public class Estabelecimento{
	//atributos
	private String nome;
	private double preco;
	private String endereco;
	private String combo;
	//construtores
	public Estabelecimento() {
		
	}
	public Estabelecimento(String nome, double preco, String endereco, String combo) {
		this.nome = nome;
		this.preco = preco;
		this.endereco = endereco;
		this.combo = combo;
	}
	//getters e setters
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCombo() {
		return combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
