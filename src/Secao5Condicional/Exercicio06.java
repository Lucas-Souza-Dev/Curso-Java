package Secao5Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numeros: ");
        double N = sc.nextDouble();

        if (N > 0 & N <= 25){
            System.out.println("Intervalo[0,25]");
        } else if (N <= 50) {
            System.out.println("Intervalo[25,50]");
        }else if (N <= 100){
            System.out.println("Intervalo[75,100]");
        }else {
            System.out.println("Fora do Valor!");
        }
        sc.close();
    }
}
