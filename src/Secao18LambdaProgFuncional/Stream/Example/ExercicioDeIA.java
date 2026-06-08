package Secao18LambdaProgFuncional.Stream.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ExercicioDeIA {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Mouse Sem Fio", 80.0, "Eletrônicos"),
                new Produto("Teclado Mecânico", 250.0, "Eletrônicos"),
                new Produto("Monitor 24'", 900.0, "Eletrônicos"),
                new Produto("Camiseta Geek", 60.0, "Vestuário"),
                new Produto("Fone de Ouvido Bluetooth", 150.0, "Eletrônicos"),
                new Produto("Livro de Java", 120.0, "Livros")
        );

        // 🎯 Sua missão começa aqui:
        List<String> nomesEletronicosCaros = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() > 100.00)
                .map(p -> p.getNome())
                .collect(Collectors.toList());

        // Imprime o resultado esperado na tela
        System.out.println("Produtos encontrados: " + nomesEletronicosCaros);

        // 💡 O resultado na tela DEVE SER EXATAMENTE:
        // Produtos encontrados: [Teclado Mecânico, Monitor 24', Fone de Ouvido Bluetooth]
    }
}

