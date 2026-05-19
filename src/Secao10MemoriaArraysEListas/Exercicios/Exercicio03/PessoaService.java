package Secao10MemoriaArraysEListas.Exercicios.Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PessoaService {
    public void retornarAlturaNomes(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.print("Quantas pessoas serao digitadas? ");
       int qtdPessoas = sc.nextInt();
       sc.nextLine();
       List<Pessoa> listaPessoas = popularPessoas(qtdPessoas);
       CalcularMedia(listaPessoas);
       obterNomesIdadeMenor16(listaPessoas);

    }
    public List<Pessoa> popularPessoas(int qtdPessoas){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Pessoa> listaPessoas = new ArrayList<>();
        for (int i = 1; i <= qtdPessoas; i++) {

            System.out.printf("Dados da %da pessoa: %n",(i));
            System.out.print("Nome :");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura= sc.nextDouble();
            sc.nextLine();

            Pessoa pessoa = new Pessoa(nome,idade,altura);
            listaPessoas.add(pessoa);
        }

        return listaPessoas;

    }
    public void CalcularMedia(List<Pessoa> listaPessoa){
        double totalAltura = 0;
        for (Pessoa p : listaPessoa) {
            totalAltura+= p.getAltura();
        }

        double mediaAltura = totalAltura / listaPessoa.size();
        System.out.printf("%nMedia Altura = %.2f %n", mediaAltura);
    }
    public void obterNomesIdadeMenor16(List<Pessoa> listaPessoa){
        for (Pessoa p : listaPessoa){
            if (p.getIdade() < 16){
                System.out.println(p.getNome());
            }
        }
    }
}
