package Secao4Sequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*  Faça um programa para ler o valor do raio de um círculo,
            e depois mostrar o valor da área deste círculo com
            quatro casas decimais conforme exemplos.

            Area = pi.raio²
            pi = 3.14159
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Raio do Circulo");
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio,2);

        System.out.printf("Area = %.4f %n", area);

        sc.close();
    }
}
