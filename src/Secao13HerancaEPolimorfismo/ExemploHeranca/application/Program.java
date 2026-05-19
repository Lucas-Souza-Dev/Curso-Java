package Secao13HerancaEPolimorfismo.ExemploHeranca.application;

import Secao13HerancaEPolimorfismo.ExemploHeranca.entities.Account;
import Secao13HerancaEPolimorfismo.ExemploHeranca.entities.BusinessAccount;
import Secao13HerancaEPolimorfismo.ExemploHeranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex",1000.0);
        acc1.withdraw(50.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Lucas", 1000.0, 0.01);
        acc2.withdraw(50.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
