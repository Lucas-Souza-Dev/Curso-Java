package Secao18LambdaProgFuncional.Function.util;

import Secao18LambdaProgFuncional.Function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
