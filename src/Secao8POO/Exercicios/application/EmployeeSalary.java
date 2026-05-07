package Secao8POO.Exercicios.application;

import Secao8POO.Exercicios.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee %s, $ %.2f %n", employee.name, employee.netSalary());
        System.out.println("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        employee.IncreaseSalary(porcentagem);

        System.out.println();
        System.out.println("Updated data: " + employee);
        sc.close();


    }
}
