package Atividades_João_Fiochi;

import java.util.Scanner;

public class Leilao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantia de lances recebidos: ");
        int n = input.nextInt();
        String Vencedor = "";
        int mL = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("Lance " + (i + 1) + ":");
            String nome = input.nextLine();
            int lance = input.nextInt(); 
            if (lance > mL || (lance == mL && i == 0)) {
                Vencedor = nome;
                mL = lance;
            }
        }
        System.out.println("Vencedor: " + Vencedor);
        System.out.println("Valor do lance vencedor:" + mL);
    }

}
