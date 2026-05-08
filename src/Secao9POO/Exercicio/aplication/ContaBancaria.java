package Secao9POO.Exercicio.aplication;

import Secao9POO.Exercicio.entities.Transacoes;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Transacoes transacoes;

        System.out.print("Enter account number: ");
        int idConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String cliente = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
        if(resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc. nextDouble();
            transacoes = new Transacoes(idConta, cliente, depositoInicial);

        }else {
            transacoes = new Transacoes(idConta, cliente);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(transacoes);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double valorDeDeposito = sc.nextDouble();
        transacoes.deposito(valorDeDeposito);
        System.out.println("Updated account data: ");
        System.out.println(transacoes);

        System.out.println();
        System.out.println("Enter a withdraw: value: ");
        double valorDeSaque = sc.nextDouble();
        transacoes.saque(valorDeSaque);
        System.out.println("Updated account data: ");
        System.out.println(transacoes);

        sc.close();
    }
}
