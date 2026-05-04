package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("diferença do produto\n" +
                "de A e B pelo produto de C e D: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int diferenca = a*b - c*d;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();

    }
}
