package Secao16Interfaces.Exercicios.ex02.application;

import Secao16Interfaces.Exercicios.ex02.services.BrazilInterestService;
import Secao16Interfaces.Exercicios.ex02.services.InterestService;
import Secao16Interfaces.Exercicios.ex02.services.UsaInterestService;
import java.util.Locale;
import java.util.Scanner;

public class DefaultMethods {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(1.0);
        double paymenet = is.payment(amount, months);

        System.out.println("Payment after "+ months + " months:");
        System.out.println(String.format("%.2f", paymenet));

        sc.close();
    }
}
