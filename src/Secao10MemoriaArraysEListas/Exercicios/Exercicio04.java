package Secao10MemoriaArraysEListas.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int repeticoes = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < repeticoes; i++) {
            System.out.print("Digite um numero: ");
                numeros.add(sc.nextInt());
        }

        int contador = 0;
        System.out.println("Numeros Pares:");
        for (int i = 0; i < repeticoes; i++) {
            if(numeros.get(i) % 2 == 0){
                System.out.print(numeros.get(i)+ " ");
                contador ++;
            }

        }
        System.out.printf("%nQuantidade de pares = %d",  contador);
    }
}
