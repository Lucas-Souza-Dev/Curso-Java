package Secao10MemoriaArraysEListas.Exercicios;
import java.util.ArrayList;
import java.util.List;
public class ExemploListas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Lucas");
        list.add("Thifany");
        list.add("Anthony");
        list.add("Matias");
        list.add(1, "Guilherme");

        System.out.println(list.size());

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("---------------");
        list.removeIf(x -> x.charAt(0) == 'M');// expressão lambda para um predicado.
        for(String x: list){
            System.out.println(x);
        }
        System.out.println("---------------");
        System.out.println("Index of Anthony: "+ list.indexOf("Anthony"));
        System.out.println("---------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList(); // .collect(Collectors.toList()
        for (String x: result){
            System.out.println(x);
        }
        System.out.println("---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);
    }
}
