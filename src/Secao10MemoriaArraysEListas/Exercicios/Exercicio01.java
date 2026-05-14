package Secao10MemoriaArraysEListas.Exercicios;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.print("Quantos numeros você vai digitar? ");
        int contador = sc.nextInt();

        for (int i = 0; i < contador; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < contador; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

    }

}
