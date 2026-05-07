package Secao6Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos casos voce vai digitar? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double n1, n2, n3, media;
            System.out.println("Digite tres numeros:");
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.println("MEDIA = " + String.format("%.1f", media));

        }
    }
}
