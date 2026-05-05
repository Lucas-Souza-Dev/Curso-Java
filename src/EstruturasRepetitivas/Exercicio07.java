package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas divisoes serão feitas? ");
        int N = sc.nextInt();
        double retorno;

        for (int i = 0; i < N; i++) {
            System.out.println("Informe X e Y");
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y == 0){
                System.out.println("Divisão Impossivel");
            }else {
                retorno = (double) X / Y;
                System.out.println(retorno);
            }

        }
        sc.close();
    }
}
