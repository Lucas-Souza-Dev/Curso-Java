package Secao7IntroducaoFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três Numeros");
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();

        double resultado = media(val1, val2, val3);

        exibeFormatado(resultado);
    }

    public static double media(double a,double b,double c){
        double aux;
        aux = (a+b+c) / 3;

        return aux;
    }

    public static void exibeFormatado(double r){
        System.out.printf("A média é: %.2f", r);
    }
}
