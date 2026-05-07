package Secao5Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Codigo | Especificação | Preço");
        System.out.println(" 1 | Cachorro Quente| R$ 4.00");
        System.out.println(" 2 | X- Salada      | R$ 4.50");
        System.out.println(" 3 | X- Bacon       | R$ 5.00");
        System.out.println(" 4 | Torrada Simples| R$ 2.00");
        System.out.println(" 5 | Refrigerante   | R$ 1.50");
        System.out.println("Escolha item e Quantidade: ");
        int item = sc.nextInt();
        int qtd = sc.nextInt();
        double preco = 0;
        switch (item){
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Valor Invalido");
                break;
        }
        double valTotal = qtd * preco;
        System.out.printf("Total: R$ %.2f", valTotal);

        sc.close();
    }
}
