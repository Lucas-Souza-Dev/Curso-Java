package Secao18LambdaProgFuncional.Predicate;
import Secao18LambdaProgFuncional.Predicate.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class PredicateExample {

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

        list.removeIf(p -> p.getPrice() >= 100.00);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
