package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        System.out.println("Digite a Senha: ");

        int tentativa = 0;

        while(tentativa != senha){
            tentativa = sc.nextInt();
            if (tentativa == senha){
                System.out.println("Acesso Permitido!");
            }else{
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}
