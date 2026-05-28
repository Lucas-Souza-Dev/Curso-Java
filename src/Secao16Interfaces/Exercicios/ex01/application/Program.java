package Secao16Interfaces.Exercicios.ex01.application;

import Secao16Interfaces.Exercicios.ex01.entities.Contract;
import Secao16Interfaces.Exercicios.ex01.entities.Installment;
import Secao16Interfaces.Exercicios.ex01.services.ContractService;
import Secao16Interfaces.Exercicios.ex01.services.PaypallService;

import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrao:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);


        System.out.println("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypallService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas: ");
        for (Installment installment: obj.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}
