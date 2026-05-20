package Secao13HerancaEPolimorfismo.MetodosAbstratos.Exercicio.aplication;

import Secao13HerancaEPolimorfismo.MetodosAbstratos.Exercicio.entities.Company;
import Secao13HerancaEPolimorfismo.MetodosAbstratos.Exercicio.entities.Individual;
import Secao13HerancaEPolimorfismo.MetodosAbstratos.Exercicio.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantityOfPayers = sc.nextInt();

        for (int i = 1; i <= quantityOfPayers; i++) {
            System.out.println("Tax payer #"+ i +" data");
            System.out.print("Individual or company(i/c)? ");
            char typeOfTax = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (typeOfTax == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExp = sc.nextDouble();
                payers.add(new Individual(name, anualIncome, healthExp));
            }else {
                System.out.print("Number od employees: ");
                int numberOfEmp = sc.nextInt();
                payers.add(new Company(name, anualIncome, numberOfEmp));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTaxes = 0.0;
        for (TaxPayer payer: payers){
            System.out.println(payer.getName() + ": $"+ String.format("%.2f",payer.tax()));
            totalTaxes+=payer.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f", totalTaxes);
    }
}
