package Delivery_João_Fiochi;

import javax.swing.JOptionPane;

public class Entregador extends Pessoa{
	//atributo
	public double numDeIdentificacao;
	//construtores
	public Entregador() {
		super();
	}
	public Entregador(String nome, int telefone, String endereco, int numDeIdentificacao) {
		super.nome = nome;
		super.telefone = telefone;
		super.endereco = endereco;
		this.numDeIdentificacao = numDeIdentificacao;
	}
	//metodo especial
	public void entregarProduto() {
		JOptionPane.showMessageDialog (null, "O entregador " +getNome()+ " (num. de identificacao: "+ numDeIdentificacao + ") ira realizar a entrega");
	}
}
