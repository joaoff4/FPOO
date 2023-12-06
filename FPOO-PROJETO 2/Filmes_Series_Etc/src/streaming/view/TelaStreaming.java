package streaming.view;

import javax.swing.JOptionPane;
import streaming.model.Filme;
import streaming.dao.Crud;

public class TelaStreaming {
	public static void main(String[] args) {
		Crud c1 = new Crud();
		Filme f1 = new Filme();
		int i = 0;
		while(i<5){
			i = (Integer.parseInt(JOptionPane.showInputDialog(null, "O que voce deseja realizar?" + "\n1-Adicionar Filme" + "\n2-Atualizar Filme"
					+"\n3-Lista de Filme" + "\n4-Excluir Filme" + "\n5-Parar programa")));
			switch(i) {
			case 1:
				f1.setNome(JOptionPane.showInputDialog("Insira o nome do filme: "));
				f1.setClassi(JOptionPane.showInputDialog("Insira a classificacao do filme: "));
				JOptionPane.showMessageDialog(null, "Nome: " + f1.getNome() + "\nClassificacao: " + f1.getClassi());
				c1.create(f1);
			break;
			case 2:
				f1.setNome(JOptionPane.showInputDialog("Insira o nome do filme: "));
				f1.setClassi (JOptionPane.showInputDialog("Insira a classificacao do filme: "));
				f1.setNumero(Integer.parseInt (JOptionPane.showInputDialog("Insira o numero do filme: ")));
				c1.update(f1);
				JOptionPane.showMessageDialog(null, "Nome: " + f1.getNome() + "\nClassificacao: " + f1.getClassi() + "\nNumero: " + f1.getNumero());	
			break;
			case 3:
				for(Filme obs : c1.read()) {
					JOptionPane.showMessageDialog(null, "Detalhes do Filme: \nNumero: " + obs.getNumero() + "\nNome: " + obs.getNome() + "\nClassificacao: " +  obs.getClassi());
				}
			break;
			case 4:
				int a = 0;
				a = (Integer.parseInt (JOptionPane.showInputDialog("Qual o numero do filme que voce deseja excluir?"))); 
				Crud remover_filme = new Crud();
				remover_filme.delete(a);
			break;
			case 5:
			break;
		}
	}
	}
}
