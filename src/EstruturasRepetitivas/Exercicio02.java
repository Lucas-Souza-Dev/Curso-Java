package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 2  |  1 ");
        System.out.println("---------");
        System.out.println(" 3  |  4 ");
        System.out.println("Informe X e Y para se localizar no quadrante:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x!=0 & y!=0){

            if (x > 0 & y > 0){
                System.out.println("Primeiro");
            } else if (x < 0 & y > 0) {
                System.out.println("Segundo");
            } else if (x < 0) {
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
