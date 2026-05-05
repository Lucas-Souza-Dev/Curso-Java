package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (escolha != 4){
            System.out.println("Selecione o Combustivel");
            System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            escolha = sc.nextInt();
            switch(escolha){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Código Invalido! Selecione novamente: ");
                    escolha = sc.nextInt();
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool: %d %n",alcool);
        System.out.printf("Gasolina: %d %n", gasolina);
        System.out.printf("Diesel: %d %n", diesel);

        sc.close();
    }
}
