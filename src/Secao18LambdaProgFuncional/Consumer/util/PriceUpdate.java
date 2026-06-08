package Secao18LambdaProgFuncional.Consumer.util;

import Secao18LambdaProgFuncional.Consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
