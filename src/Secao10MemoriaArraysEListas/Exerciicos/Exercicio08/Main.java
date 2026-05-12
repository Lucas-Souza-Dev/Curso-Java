package Secao10MemoriaArraysEListas.Exerciicos.Exercicio08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtdPessoas = sc.nextInt();
        int maiorIdade = 0;
        String maisVelho = "";

        Pessoas[] vetor = new Pessoas[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n",(i+1));
            System.out.print("Nome :");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vetor[i] = new Pessoas(nome, idade);

            if (idade > maiorIdade){
                maiorIdade = idade;
                maisVelho = vetor[i].getNome();
            }
        }
        System.out.println("Pessoa Mais Velha: " + maisVelho);
    }
}
