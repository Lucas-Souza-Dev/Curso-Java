package Secao6Repetitivas;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            double quadrado = Math.pow(i,2);
            double cubo = Math.pow(i,3);

            System.out.printf("%d %d %d %n", i, (int)quadrado, (int)cubo);
        }
    }
}
