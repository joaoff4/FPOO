package Atividades_João_Fiochi;

import java.util.Iterator;
import java.util.Scanner;

public class Leilao1 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero de lances recebidos: ");
        int numero = entrada.nextInt();
        int v = 0;
        int []n= {v};
        String c= null;//variavel sem nada
        String []n1 = {c};
        for(int i =0; i < numero; i++) {
            System.out.println("escreva o nome:");
            String c1 = entrada.next();
            System.out.println("escreva o valor dos lances:");
            int lance = entrada.nextInt();
            if (lance > n[0]){
                n[0] = lance;
                n1[0] = c1;
            }
        }
        System.out.printf("O nome do vencedor e: %s\n", n1[0]);
        System.out.printf("O valor dado e: %d", n[0]);
    }
}
