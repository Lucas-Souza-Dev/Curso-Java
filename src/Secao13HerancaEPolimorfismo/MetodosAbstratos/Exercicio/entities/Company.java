package Secao13HerancaEPolimorfismo.MetodosAbstratos.Exercicio.entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxToPay = 0.0;
        if (numberOfEmployees <= 10){
            taxToPay = 0.16;
        }else{
            taxToPay = 0.14;
        }

        return getAnualIncome() * taxToPay;
    }


}
