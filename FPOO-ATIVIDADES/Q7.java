package Atividades_João_Fiochi;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 
		 int moedas =entrada.nextInt();
		 int marinheiros = entrada.nextInt();
		 int capitao,  divisao;
		 
		 capitao = 2;
		 divisao = moedas/(marinheiros+capitao);
		 System.out.println("quantia para o Olho Roxo" + divisao);
	}

}
