package Atividades_João_Fiochi;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	     Scanner entrada = new Scanner (System.in);
	     int operacao;
	     do {
	         exibirMenu(); 
	         operacao = entrada.nextInt();
	         double resultado;
	         switch (operacao) {
	         case 1:
	             System.out.println("adicao");
	             System.out.println("digite o 1º numero");
	            double num1 = entrada.nextDouble();    
	            System.out.println("digite o 2º numero");
	            double num2 = entrada.nextDouble();
	            resultado = (num1+num2);
	             break;
	         case 2:
	             System.out.println("subtracao");
	             break;
	         case 3:
	             System.out.println("divisao");
	          break;
	         case 4:
	             System.out.println("multiplicacao");
	          break;
	         default:
	             System.out.println("escolha as operacao de 1 a 4");
	             break;
	         }System.out.println();
	     }while(operacao != 0);
}
	public static void exibirMenu() {
		System.out.println("selecione uma opcao:");
        System.out.println("1-adicao");
        System.out.println("2-subtracao");
        System.out.println("3-divisao");
        System.out.println("4-multiplicacao");
        System.out.println("0-SAIR");
		
	}
}

