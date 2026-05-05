package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Numero para ver seus multiplos antecessores!");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
