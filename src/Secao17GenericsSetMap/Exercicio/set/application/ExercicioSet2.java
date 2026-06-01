package Secao17GenericsSetMap.Exercicio.set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet2 {
    // Forma mais rápida utilizando HashSet, Dessa forma também temos acesso aos alunos de cada curso.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("How many students for course A? ");
        int rep = sc.nextInt();
        for (int i = 1; i <= rep; i++) {
            A.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        rep = sc.nextInt();
        for (int i = 1; i <= rep; i++) {
            B.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        rep = sc.nextInt();
        for (int i = 1; i <= rep; i++) {
            C.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total students: "+ total.size());

        sc.close();
    }
}
