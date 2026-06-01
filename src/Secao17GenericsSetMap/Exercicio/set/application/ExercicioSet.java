package Secao17GenericsSetMap.Exercicio.set.application;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {
    //Forma direta de contar, utilizando LinkedHashSet.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> idAlunos = new LinkedHashSet<>();

        System.out.print("How many students for course A?");
        int contador = sc.nextInt();
        for (int i = 1; i <= contador; i++) {
            idAlunos.add(sc.nextInt());
        }
        System.out.print("How many students for course B?");
        contador = sc.nextInt();
        for (int i = 1; i <= contador; i++) {
            idAlunos.add(sc.nextInt());
        }
        System.out.print("How many students for course C?");
        contador = sc.nextInt();
        for (int i = 1; i <= contador; i++) {
            idAlunos.add(sc.nextInt());
        }

        System.out.println("Total students: " + idAlunos.size());

        sc.close();
    }
}
