package Atividades_João_Fiochi;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int a;
		boolean condicao = true;
		int soma = 0;
		Scanner entrada = new Scanner(System.in);{
			System.out.println("digite valores positivos para soma-los");
			while(condicao) {
				
				a = entrada.nextInt();
				
				if(a < 0) {
					break;
				}
				soma = soma + a;
			}
			System.out.println("Restultado da soma:" + soma);
		}
	 }
}



