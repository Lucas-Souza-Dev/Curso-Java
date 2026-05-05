package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial*= i;
        }
        System.out.printf("FATORIAL = %d",fatorial);
    }
}
