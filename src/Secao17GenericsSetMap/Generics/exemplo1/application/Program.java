package Secao17GenericsSetMap.Generics.exemplo1.application;

import Secao17GenericsSetMap.Generics.exemplo1.entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
        PrintService<String> psString = new PrintService<>();

        System.out.println("How Many Values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());

        System.out.println("How Many Names? ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String value = sc.next();
            psString.addValue(value);
        }

        psString.print();
        System.out.println("First: " + psString.first());

        sc.close();
    }
}
