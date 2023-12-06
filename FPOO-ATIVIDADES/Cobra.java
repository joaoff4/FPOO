package Atividades_João_Fiochi;

import java.util.Scanner;

public class Cobra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //sequencia cobras verdadeiras = 5 3 9 3
        //sequencia cobras falsas = 3 9 5 3
        System.out.println("escreva a sequencia:");
        int [] numeros = new int[4];//numeros da sequencia
        for(int i = 0; i < 4; i++) {
            numeros[i] = entrada.nextInt();
        }
        if (numeros[0] == numeros[2] || numeros[1] == numeros[3]) { //se o 1º=3º/2º=3º é V se n, F
            System.out.println("V");
        }
        else {
            System.out.println("F");
        }
    }
}
