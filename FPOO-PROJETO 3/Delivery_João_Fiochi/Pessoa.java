package Delivery_João_Fiochi;

public class Pessoa {
	//atributos 😀
	protected String nome;
	protected int telefone;
	protected String endereco;
	//construtores
	public Pessoa() {
		
	}
	public Pessoa(String nome, int telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
