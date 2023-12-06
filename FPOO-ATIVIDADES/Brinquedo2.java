package Atividades_João_Fiochi;

public class Brinquedo2 {
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	public Brinquedo2() {
		
	}
	public Brinquedo2(String nome , double alturaMinima, int capacidadeMaxima) {
		this.nome = nome;
		this.alturaMinima = alturaMinima;
	}
	//modelos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome, String nome) {
		this.nome = nome;
	}
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public void exibirInfo() {
		System.out.println("Brinquedo: " + nome);
		System.out.println("Altura mínima: " + alturaMinima);
		System.out.println("Capacidade Máxima: " + capacidadeMaxima + "pessoas");
	}
}
