package Secao10MemoriaArraysEListas.Exercicios.Exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        char genero ;

        System.out.println("Quantas pessoas serao digitadas? ");
        int qtdPessoas = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[qtdPessoas];
        double totAlturaMulheres = 0;
        int totalHomens = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Altura da %da pessoa: ", (i+1));
            altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", (i+1));
            genero = sc.next().charAt(0);

            pessoa[i] = new Pessoas(altura, genero);

            if (genero == 'm' || genero == 'M') {
                totalHomens++;
            }
        }
        double menor = Pessoas.menorAltura(pessoa);
        double maior = Pessoas.maiorAltura(pessoa);
        double mediaMulheres = Pessoas.mediaAlturaMulheres(pessoa);
        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media altura mulheres = %.2f%n", mediaMulheres);
        System.out.println("Numero de homens = "+ totalHomens);
    }
}
