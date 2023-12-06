package Atividades_João_Fiochi;

import java.util.Scanner;

public class Contas2 {

	public static void main(String[] args) {
		int V,a,p,f;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Valor da aposentadoria");
		V = entrada.nextInt();
		System.out.println("Valor da conta do acougue");
		a = entrada.nextInt();
		System.out.println("Valor da conta da padaria");
		p = entrada.nextInt();
		System.out.println("Valor da conta da farmacia");
		f = entrada.nextInt();
		if (V >= (a+f+p)) {
			System.out.println("3");
		} else if(V>= (a+f) || V>= (a+p)){
			System.out.println("2");
			if(V >= a || V>= f || V>=p)
			System.out.println("1");
		}
	}
}
