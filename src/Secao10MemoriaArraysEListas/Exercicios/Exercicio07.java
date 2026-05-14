package Secao10MemoriaArraysEListas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void mediaPares(int contador,int[] vet1){
        double totPares = 0;
        int nPares = 0;

        for (int i = 0; i < contador; i++) {
            if(vet1[i]%2 == 0) {
                totPares+=vet1[i];
                nPares++;
            }
        }
        if (nPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            double media = totPares / nPares;
            System.out.printf("MEDIA DOS PARES = %.2f", media);
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        System.out.println("Quantos elementos vai ter o vetor? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        mediaPares(qtdRep,vet);

    }
}
