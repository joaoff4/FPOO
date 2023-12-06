package Atividades_João_Fiochi;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Insira os valores das contas a serem pagas:");
		 int V = 1000; 
		 int a = entrada.nextInt();
		 int f = entrada.nextInt();
		 int p = entrada.nextInt();
 
		 if(V - a + f + p >= 0)
			 System.out.println("As contas serao pagas");
			 else 
				 System.out.println("As contas nao serao pagas");
		 
	}

}
