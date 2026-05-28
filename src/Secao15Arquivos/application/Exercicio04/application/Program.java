package Secao15Arquivos.application.Exercicio04.application;

import Secao15Arquivos.application.Exercicio04.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "c:\\temp\\prod.csv";

        List <Product> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null){
                String[] vect = line.split(",");
                String name = vect[0];
                Double price = Double.parseDouble(vect[1]);
                Integer qte = Integer.parseInt(vect[2]);

                Product prod = new Product(name, price, qte);
                list.add(prod);

                line = br.readLine();
            }
            System.out.println("PRODUCTS: ");
            for (Product p : list){
                System.out.println(p);
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
