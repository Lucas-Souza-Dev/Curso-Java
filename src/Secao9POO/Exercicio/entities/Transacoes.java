package Secao9POO.Exercicio.entities;

public class Transacoes {
    private  int idConta;
    private String nome;
    private double saldo;


    // Construtor
    public Transacoes(int idConta, String nome) {
        this.idConta = idConta;
        this.nome = nome;
    }
    // Sobrecarga
    public Transacoes(int idConta, String nome, double saldoInicial) {
        this.idConta = idConta;
        this.nome = nome;
        deposito(saldoInicial);
    }
    //getters e setters
    public int getIdConta() {
        return idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // transacoes de saldo
    public void deposito(double qtdDeposito){
        saldo += qtdDeposito;
    }

    public void saque(double qtdSaque){
        saldo -= qtdSaque + 5.0;
    }

    public String toString(){
        return "Account "
                + idConta
                +", Holder: "
                + nome
                +", Balance: $ "
                +String.format("%.2f" , saldo);

    }
}
