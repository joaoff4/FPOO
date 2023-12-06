package streaming.model;

public class Filme {
	private int numero;
	private String nome;
	private String classificacao;
	//construtor
	public Filme() {
		
	}
	public void Filme(int numero, String nome, String classificacao ) {
		this.classificacao = classificacao;
		this.nome = nome;
		this.numero = numero;
	}
	//getters e setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClassi() {
		return classificacao;
	}
	public void setClassi(String classificacao) {
		this.classificacao = classificacao;
	}
	public static void add(Filme ver_Filme) {
		// TODO Auto-generated method stub
		
	}
	
}
