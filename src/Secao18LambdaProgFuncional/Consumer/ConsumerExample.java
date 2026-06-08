package Secao18LambdaProgFuncional.Consumer;

import Secao18LambdaProgFuncional.Consumer.util.PriceUpdate;
import Secao18LambdaProgFuncional.Consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.00));

        //Lambda declarada
        double factor = 1.1;
        Consumer<Product> cons = p ->{
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(Product::staticPriceUpdate);
       list.forEach(System.out::println);
    }
}
