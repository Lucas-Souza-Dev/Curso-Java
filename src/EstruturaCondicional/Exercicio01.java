package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.println("Digite um numero: ");
        N = sc.nextInt();

        if (N > 0){
            System.out.println("Não Negativo");
        }else{
            System.out.println("Negativo");
        }

        sc.close();
    }
}
