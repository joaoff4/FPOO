package Atividades_João_Fiochi;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int num;
		int menor = 0;
		boolean primeiroNum = true;
		System.out.println("digite numeros postivos e negativos");
		Scanner entrada = new Scanner(System.in);{
			while(primeiroNum) {
				num = entrada.nextInt();
				if(num == 0) {
					break;
				}
				if(primeiroNum) {
					menor = num;
					primeiroNum = false;
				}else if(num < menor){
					menor = num;
				}
				if (primeiroNum) {
					System.out.println("nenhum numero foi digitado!");
				} else {
					System.out.println("o menor numero digitado foi: " + menor);
				}
			}
			
		}
	 }
}
