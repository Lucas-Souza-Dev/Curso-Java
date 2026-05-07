package Secao6Repetitivas;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros serão Digitados: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um Numero:");
            int valInfo = sc.nextInt();

            if (valInfo >= 10 & valInfo <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.printf("%d in %n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
}
