package Secao5Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua renda para ser cobrado o imposto de renda: ");
        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 2000.00){
            imposto = 0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000) * 0.8;
        }else if(salario <=4500.00){
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
        }else{
            imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto != 0 ){
            System.out.printf("R$ %.2f", imposto);
        }else {
            System.out.println("Isento");
        }

        sc.close();
    }
}
