package Secao8POO.Exercicios.entities;

public class CurrencyConverter {
    public static double converter(double dollarPrice, double amountOfDollars){
        double real = amountOfDollars * dollarPrice;
        double percent = (6 * real / 100);
        return real + percent;
    }
}
