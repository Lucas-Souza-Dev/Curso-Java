package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe hora de Inicio e Fim: ");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int duracao;

        if (inicio > fim){
            duracao = 24 - inicio + fim;
        }else {
            duracao = inicio + fim;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)",duracao);
    }
}
