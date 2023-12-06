package Delivery_João_Fiochi;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
	//atributo
	public double saldo;
	private String cpf;
	//construtores
	public Cliente() {
		super();
	}
	public Cliente(String nome, int telefone, String endereco, int saldo, String cpf) {
		super.nome = nome;
		super.telefone = telefone;
		super.endereco = endereco;
		this.saldo = saldo;
		this.cpf = cpf;
	}
	//getters e setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//metodo especial
	public void dadosCliente() {
		JOptionPane.showMessageDialog (null,"----Dados do cliente----"+"\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " + getTelefone() 
			+"\nSaldo: " + getSaldo() + "\n----------------------------");
	}
}
