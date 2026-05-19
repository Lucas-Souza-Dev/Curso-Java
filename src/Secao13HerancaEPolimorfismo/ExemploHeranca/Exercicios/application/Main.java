package Secao13HerancaEPolimorfismo.ExemploHeranca.Exercicios.application;

import Secao13HerancaEPolimorfismo.ExemploHeranca.Exercicios.entities.ImportedProduct;
import Secao13HerancaEPolimorfismo.ExemploHeranca.Exercicios.entities.Product;
import Secao13HerancaEPolimorfismo.ExemploHeranca.Exercicios.entities.UsedProduct;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantityOfProducts = sc.nextInt();

        for (int i = 1; i <= quantityOfProducts ; i++) {
            System.out.println("Product #"+i+"data:");
            System.out.print("Common, used or imported(c/u/i)?");
            String type = sc.next();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type.equals("u")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product product = new UsedProduct(name, price, date);
                products.add(product);
            } else if (type.equals("i")) {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }else{
                Product product = new Product(name, price);
                products.add(product);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product prod : products){
            System.out.println(prod.priceTag());
        }

     sc.close();
    }

}
