package Secao10MemoriaArraysEListas.Exerciicos.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

import Secao10MemoriaArraysEListas.Exerciicos.Exercicio03.Pessoa;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int contador = sc.nextInt();
        Pessoa[] vetor = new Pessoa[contador];

        double somaAlturas = 0;
        int menoresDe16 = 0;

        for (int i = 0; i < contador; i++) {
            sc.nextLine();

            System.out.printf("Dados da %da pessoa: %n",(i+1));
            System.out.print("Nome :");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura= sc.nextDouble();

            vetor[i] = new Pessoa(nome,idade,altura);

            somaAlturas+=altura;

            if (idade < 16){
                menoresDe16 ++;
            }
        }
        double mediaAltura = somaAlturas/ contador;

        double porcentagem = ((double) menoresDe16 / contador) * 100;

        System.out.printf("%n Altura média: %.2f %n", mediaAltura);
        System.out.printf(" Pessoas com menos de 16 anos: %.2f %n", porcentagem);

        for (int i = 0; i < contador; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }

    }
}
