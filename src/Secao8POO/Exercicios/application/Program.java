package Secao8POO.Exercicios.application;

import java.util.Locale;
import java.util.Scanner;
import Secao8POO.Exercicios.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangular = new Rectangle();
        System.out.println("Enter rectangle width and height");
        rectangular.width = sc.nextDouble();
        rectangular.height = sc.nextDouble();

        double area = rectangular.Area();
        double perimetro = rectangular.Perimeter();
        double diagonal = rectangular.Diagonal();

        System.out.printf("AREA = %.2f %n", area);
        System.out.printf("PERIMETER = %.2f %n", perimetro);
        System.out.printf("DIAGONAL = %.2f %n", diagonal);


    }
}
