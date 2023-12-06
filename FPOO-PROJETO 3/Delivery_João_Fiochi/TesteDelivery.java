package Delivery_João_Fiochi;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.List;

public class TesteDelivery {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//instanciando entregador
		Entregador ent = new Entregador();
		ent.numDeIdentificacao = Math.random();  		//math.random para gerar um numero aleatorio de identificacao para o entregador
		//instanciando delivery
		Delivery d1 = new Delivery();
		d1.nome = "Delicias Delivery";
		d1.contato = "(19) 1919-9191";
		d1.boasVindas();
		//instanciando Cliente
		Cliente c1 = new Cliente();
		c1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
		c1.setCpf(JOptionPane.showInputDialog("Insira seu CPF (ex: xxx.xxx.xxx-xx) : "));
		c1.setTelefone(Integer.parseInt (JOptionPane.showInputDialog("Insira seu telefone (apenas numeros): ")));		//Integer.parseInt para capturar um valor inteiro
		c1.setSaldo (Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo que voce deseja utilizar para compras")));		//Double.parseDouble para capturar um valor double
		c1.dadosCliente();
		//1ª instancia estabelecimento
		Estabelecimento e1 = new Estabelecimento("----Pizzaria Napoli----", 49.99, "Rua 75, Num. 906, Centro", 
				"Combo: Pizza de Calabresa + Refrigerante 2L + Porcao de fritas (grande)"   );
		//2ª instancia estabelecimento
		Estabelecimento e2 = new Estabelecimento("----Lanchonete Sabor Supremo----", 55.99, "Rua da amizade, Num. 603, Vale dos Passaros", 
				"Combo: 2 X-Bacon + 1 X-Salada + 2 Guaranás 1L + 1 Suco 2L");
		//3ª instancia estabelecimento
		Estabelecimento e3 = new Estabelecimento("----Restaurante Divino Sabor----", 40.99, "Avenida Alta, Num. 118, Recanto Dourado ", 
				"Combo: 3 Marmitas prato do dia (Grande) +  1 Suco de Uva 2L");
		//4ª instancia estabelecimento
		Estabelecimento e4 = new Estabelecimento("----Restaurante Oriental Kyoto Delicias----", 80.94, "Rua dos sonhos, Num. 239, Jardim Prateado",
				"Combo: 4 Temakis Filadelfia +  4 Refrigerantes Lata 250mL");
		//5ª instancia estabelecimento
		Estabelecimento e5 = new Estabelecimento("----Sorveteria Estelar----", 41.69, "Rua d'agua, Num. 444, Novo Recanto Dourado", 
				"Combo: 2 copos de acai 500mL +  2 Refrigerantes Garrafa 1L" );
		//criando lista
		List <Estabelecimento> Est = new ArrayList<Estabelecimento>();		
		Est.add(e1);
		Est.add(e2);
		Est.add(e3);
		Est.add(e4);
		Est.add(e5);
		//exibindo lista
		int dpe = 0;
		JOptionPane.showMessageDialog(null, "----COMBOS EM PROMOCAO----");
		for(Estabelecimento es : Est ) {
			JOptionPane.showMessageDialog(null, es.getNome() + "\nEndereco: " + es.getEndereco() +"\n" + es.getCombo() + "\nValor: " + es.getPreco() ); 
		dpe++;
		}
		//Selecionar Pedido
		JOptionPane.showMessageDialog(null, "----A seguir selecione seu pedido---- " + "\n1- Combo Pizzaria Napoli" + "\n2- Combo Lanchonete Sabor Supremo" + 
				"\n3- Combo Restaurante Divino Sabor" + "\n4- Combo Restaurante Oriental Kyoto Delicias" + "\n5- Combo Sorveteria Estelar");
		int esc = (Integer.parseInt (JOptionPane.showInputDialog("Insira sua escolha: ")));
		double valor = 0;
		switch (esc) {
		case 1:
			JOptionPane.showMessageDialog(null, "Voce selecionou o combo da Pizzaria Napoli");
			valor = 49.99;
			ent.setNome("Rogerio");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Voce selecionou o combo da Lanchonete Sabor Supremo");
			valor = 55.99;
			ent.setNome("Kleber");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Voce selecionou o combo do Restaurante Divino Sabor");
			valor = 40.99;
			ent.setNome("Claudio");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,"Voce selecionou o combo do Restaurante Oriental Kyoto Delicias");
			valor =80.94;
			ent.setNome("Cristiano");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Voce selecionou o combo da Sorveteria Estelar");
			valor =41.69;
			ent.setNome("Lucas");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Escolha Invalida");
			break;
		}
		//condicoes para efetuar a transacao
		if (esc >= 1 && esc <= 5 && c1.getSaldo() - valor >= 0) {
			JOptionPane.showMessageDialog(null,"Compra efetuada =)");
			c1.setEndereco(JOptionPane.showInputDialog("Selecione o endereco para a entrega:"));
			ent.entregarProduto();
		} else if(valor < 0){
			JOptionPane.showMessageDialog(null,"Voce nao possui saldo suficiente para realizar a compra, COMPRA CANCELADA.");
		}else if(esc <= 0){
			JOptionPane.showMessageDialog(null,"Escolha invalida, COMPRA CANCELADA.");
		}
		JOptionPane.showMessageDialog(null,"Obrigado por utilizar nosso sistema Delivery =)");
	}
}
