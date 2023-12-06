package Atividades_João_Fiochi;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int num_aleatorio = (int) (Math.random()* 100) + 1;
		int tentativas;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		while (true) {
            tentativas = entrada.nextInt();
            contador = contador +1;
        if (num_aleatorio == tentativas) {
            System.out.println("vc acertou!!");
            System.out.println("vc digitou: " + contador +  " vezes");
        }else if (num_aleatorio > tentativas) {
            System.out.println("maior!!");
        }else if (num_aleatorio < tentativas){
            System.out.println("menor!");
        	}
        }
	}
}
