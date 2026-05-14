package Secao10MemoriaArraysEListas.Exercicios.Exercicio05;

import java.util.Scanner;

public class Main {
    public static void SomaVetores(int rep, int[] vet1, int[] vet2){
        int[] vet3 = new int[10];
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < rep; i++) {
            vet3[i] = vet1[i]+vet2[i];
            System.out.println(vet3[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];


        System.out.println("Quantos valores vai ter cada vetor?");
        int rep = sc.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < rep; i++) {
            vet1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < rep; i++) {
            vet2[i] = sc.nextInt();
        }
        Main.SomaVetores(rep,vet1,vet2);

    }


}
