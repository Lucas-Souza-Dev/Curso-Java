package Secao10MemoriaArraysEListas.Exerciicos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> vetor = new ArrayList<>();
        double soma = 0;
        double media = 0;
        System.out.println("Quantos numeros você vai digitar? ");
        int contador = sc.nextInt();

        for (int i = 0; i < contador; i++) {
            System.out.print("Digite um numero: ");
            vetor.add(sc.nextDouble());

            soma += vetor.get(i);
        }
        media = soma / vetor.size();

        System.out.print("VALORES: ");

        for (int i = 0; i < vetor.size(); i++) {
            System.out.print(vetor.get(i) + " ");
        }

        System.out.printf("%n" +
                "SOMA = %.2f %n", soma);
        System.out.printf("MEDIA = %.2f", media);

    }
}
