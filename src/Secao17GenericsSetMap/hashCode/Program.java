package Secao17GenericsSetMap.hashCode;

import Secao17GenericsSetMap.hashCode.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Lucas", "lucas@gmail.com");
        Client c2 = new Client("Lucas", "lucas@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}
