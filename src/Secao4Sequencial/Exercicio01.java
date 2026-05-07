package Secao4Sequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite dois numeros a e b para soma:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();


        System.out.println("SOMA = " + (num1 + num2));

        sc.close();
    }
}
