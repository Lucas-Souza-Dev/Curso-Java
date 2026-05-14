package Secao10MemoriaArraysEListas.Exercicios.Exercicio09;

public class Alunos {
    private String nome;
    public double nota1;
    public double nota2;

    public Alunos(double nota1, double nota2, String nome) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public static void aprovados(String nome, double nota1 , double nota2){
        double media = (nota1 + nota2) / 2;
        if (media > 6){
            System.out.println(nome);
        }
    }
}
