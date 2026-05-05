package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Valor: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
