package Secao10MemoriaArraysEListas.Exerciicos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaN = new ArrayList<>();
        double somaLista = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int rep = sc.nextInt();

        for (int i = 0; i < rep; i++) {
            System.out.print("Digite um numero: ");
            listaN.add(sc.nextDouble());

            somaLista+=listaN.get(i);
        }
        double media = somaLista / listaN.size();
        System.out.printf("Media do Vetor = %.3f%n", media);
        System.out.println("Elementos Abaixo da Media:");

        for (int i = 0; i < rep; i++) {
            if (listaN.get(i) < media){
                System.out.printf("%.1f%n",listaN.get(i));
            }
        }
    }
}
