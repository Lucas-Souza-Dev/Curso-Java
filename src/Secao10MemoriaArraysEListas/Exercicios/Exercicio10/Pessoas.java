package Secao10MemoriaArraysEListas.Exercicios.Exercicio10;

public class Pessoas {
    public double altura;
    public char genero;

    public Pessoas(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public static double menorAltura(Pessoas[] pessoa) {
        double menor = pessoa[0].altura;
        for (Pessoas pessoas : pessoa) { // (int i = 0; i < pessoa.length; i++)
            if (pessoas.altura < menor) {
                menor = pessoas.altura;
            }
        }
        return menor;
    }

    public static double maiorAltura(Pessoas[] pessoa) {
        double maior = pessoa[0].altura;
        for (Pessoas pessoas : pessoa) {
            if (pessoas.altura > maior) {
                maior = pessoas.altura;
            }
        }
        return maior;
    }

    public static double mediaAlturaMulheres(Pessoas[] pessoa) {
        double soma = 0;
        int qtd = 0;

        for (Pessoas p : pessoa) {
            if (p.genero == 'F'|| p.genero == 'f') {
                soma += p.altura;
                qtd++;
            }
        }

        return soma / qtd;
    }
}

