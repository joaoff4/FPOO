package Atividades_João_Fiochi;

import java.util.Scanner;

public class Contas3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		 int V = entrada.nextInt(); 
		 int a = entrada.nextInt();
		 int f = entrada.nextInt();
		 int p = entrada.nextInt();
		 //utilizando vetor
		 int resp = 0;
		 int [] contas = {a, f, p};
		 
		 if (contas [0] + contas [1] + contas [2] <= V)
		 		resp = 3;
		 else if(contas [0] + contas [1] <= V)
		 		resp = 2;
		 else if(contas [0] <= V)
				 resp = 1;
		 else
		 	resp = 0;
		 System.out.printf("%d/n", resp);
	}
}