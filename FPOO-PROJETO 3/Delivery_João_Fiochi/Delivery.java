package Delivery_João_Fiochi;

import javax.swing.JOptionPane;

public class Delivery {
	//atributos
	public String nome;
	public String contato;
	//construtores
	public Delivery() {
		
	}
	public void Delivery(String nome, String contato ) {
		this.nome = nome;
		this.contato = contato;
	}
	//metodo especial
	public void boasVindas() {
		JOptionPane.showMessageDialog (null, "----Bem vindo ao " + nome + "----" + "\n----Contato: " + contato + "----");
	}
}
