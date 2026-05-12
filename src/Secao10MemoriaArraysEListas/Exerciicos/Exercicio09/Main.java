package Secao10MemoriaArraysEListas.Exerciicos.Exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int qtdAlunos = sc.nextInt();

        Alunos[] aluno = new Alunos[qtdAlunos];
        for (int i = 0; i < qtdAlunos; i++) {
            sc.nextLine();

            System.out.printf("Digite nome, primeira e segunda nota do %do Aluno: %n",(i+1));
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            aluno[i] = new Alunos(nota1,nota2,nome);

        }
        System.out.println("Alunos Aprovados");
        for (int i = 0; i < qtdAlunos; i++) {
            Alunos.aprovados(aluno[i].getNome(), aluno[i].nota1, aluno[i].nota2);
        }
    }
}
