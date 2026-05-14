package Secao10MemoriaArraysEListas.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual será a Ordem da Matriz? ");
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= sc.nextInt();
            }
        }
        int contnegativos = 0;
        System.out.println("Main diagonal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
                if (matriz[i][j] < 0){
                    contnegativos++;
                }
            }
        }
        System.out.println();
        System.out.print("Negative numbers= "+ contnegativos);


    }
}
