package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x;
        double y;

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (x == 0 & y ==0) {
                System.out.println("Origem");
            }else if (x > 0 & y > 0) {
                System.out.println("Q1 ");
            }else if (x < 0 & y > 0) {
                System.out.println(" Q2 ");
            }else if (x < 0 & y < 0) {
                System.out.println("Q3 ");
            }else if (x > 0 & y < 0){
                System.out.println("Q4 ");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else {
                System.out.println("Eixo X");
            }
    }
}

