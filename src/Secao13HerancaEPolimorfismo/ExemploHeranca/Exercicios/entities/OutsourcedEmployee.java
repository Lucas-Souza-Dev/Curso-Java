package Secao13HerancaEPolimorfismo.ExemploHeranca.Exercicios.entities;

public class OutsourcedEmployee extends Employee{

    private double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;//110% de additionalCharge
    }
}
