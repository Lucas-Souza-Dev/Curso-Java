package Secao8POO.Exercicios.application;

import Secao8POO.Exercicios.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class DollarsToReais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        double reais = CurrencyConverter.converter(price,dollars);
        System.out.printf("Amount to be paid in reais = R$%.2f", reais);
    }
}
