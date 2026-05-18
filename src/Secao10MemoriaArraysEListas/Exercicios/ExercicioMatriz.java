package Secao10MemoriaArraysEListas.Exercicios;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Linhas terá a matriz? ");
        int M = sc.nextInt();
        System.out.println("Quantas Colunas terá a matriz? ");
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Selecione um numero cadastrado: ");
        int selecao = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == selecao){
                    System.out.println("Position " + i + "," + j);
                    if (i > 0){
                        System.out.println("UP "+ matriz[i - 1][j]);
                    }
                    if(j > 0){
                        System.out.println("Left "+ matriz[i][j-1]);
                    }
                    if(j < N-1){ // (j < matriz[i].length-1)
                        System.out.println("Rigth "+ matriz[i][j+1]);
                    }
                    if (i < M-1){ // (matriz.length-1)
                        System.out.println("Down "+ matriz[i+1][j]);
                    }
                }
            }
            sc.close();
        }
    }
}
