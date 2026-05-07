package Secao8POO.application;

import Secao8POO.entities.Triangulo;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Preencha as medidas do Triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Preencha as medidas do Triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Area do Triangulo X: %.4f %n", areaX);
        System.out.printf("Area do Triangulo Y: %.4f %n", areaY);

        if (areaX > areaY){
            System.out.println("Triangulo X é Maior que o Triangulo Y");
        }else{
            System.out.println("Triangulo Y é Maior que o Triangulo X");
        }
    }
}
