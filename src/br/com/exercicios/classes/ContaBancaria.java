package br.com.exercicios.classes;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldoDaConta;
    
    public ContaBancaria(int numeroDaConta, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }
    
    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }
    
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    @Override
    public String toString() {
        String string = "O saldo da conta %d é R$%.2f.".formatted(this.numeroDaConta, this.saldoDaConta);
        return string;
    }
}
