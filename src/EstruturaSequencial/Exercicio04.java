package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu id suas horas trabalhadas e o valor a receber por hora: ");
        int id = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valPorHora = sc.nextDouble();

        double salario = horasTrab * valPorHora;

        System.out.printf("NUMBER = %d %n", id);
        System.out.printf("SALARY = U$%.2f", salario);
    }
}
