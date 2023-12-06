package br.org.sesisp.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	CrudDAO  iA = new CrudDAO();
	Aluno a1 = new Aluno();
	int i = 0;
	while(i<5) {
		JOptionPane.showMessageDialog(null, "O que voce deseja realizar?" + "\n1-Adicionar Aluno" + "\n2-Atualizar Aluno"
				+ "\n3-Lista de Alunos" + "\n4-Excluir aluno" + "\n5-Parar programa");
		i = (Integer.parseInt (JOptionPane.showInputDialog("Insira sua escolha: ")));
		switch(i) {
		case 1:
		a1.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		a1.setIdade(Integer.parseInt (JOptionPane.showInputDialog("Insira a idade do aluno: ")));
		JOptionPane.showMessageDialog(null, "Nome: " + a1.getNome() + "\nIdade: " + a1.getIdade());
		iA.create(a1);
		break;
		case 2:
		a1.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
		a1.setIdade(Integer.parseInt (JOptionPane.showInputDialog("Insira a idade do aluno: ")));
		a1.setRa(Integer.parseInt (JOptionPane.showInputDialog("Insira o RA do aluno: ")));
		iA.update(a1);
		JOptionPane.showMessageDialog(null, "Nome: " + a1.getNome() + "\nIdade: " + a1.getIdade() + "\nRA: " + a1.getRa());	
		break;
		case 3:
		for(Aluno obs : iA.read()) {
			JOptionPane.showMessageDialog(null, "Dados do aluno: \nRA: " + obs.getRa() + "\nNome: " + obs.getNome() + "\nIdade: " +  obs.getIdade());
		}
		break;
		case 4:
			int a = 0;
			a = (Integer.parseInt (JOptionPane.showInputDialog("Qual o ra do aluno que voce deseja excluir:"))); 
		CrudDAO remover_aluno = new CrudDAO();
		remover_aluno.delete(a);
		break;
		case 5:
		break;
		}
	}
	}
}
