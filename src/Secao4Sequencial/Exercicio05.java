package Secao4Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a peça, quantidade e valor unitário: (12 1 5.30)");
        int peca = sc.nextInt();
        int qtdPeca = sc.nextInt();
        double valPeca = sc.nextDouble();

        double totalAPagar = (double)qtdPeca * valPeca;

        System.out.printf("VALOR A PAGAR: R$ %.2f %n", totalAPagar);

        sc.close();
    }
}
