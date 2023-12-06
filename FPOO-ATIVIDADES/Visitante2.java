package Atividades_João_Fiochi;

public class Visitante2 {
	private String nome;
	private double altura;
	private int idade;
	
public Visitante2(String nomeVisitante1, int idadeVisitante1, double alturaVisitante1) {
		
	}
	public void Vistitante2(String nome , double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome, String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean podeAndarNoBrinquedo() {
	if(altura >= 12 || altura >1.2 ) {
		return  true;
	}else {
		return false;
	}
}
	public void exibirInfo() {
		System.out.println("Visitante: " + nome);
		System.out.println("Idade" + idade + "anos");
		System.out.println("altura " + altura + "m");
	}
}
