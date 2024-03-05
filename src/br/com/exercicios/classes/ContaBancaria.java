package br.com.exercicios.classes;

// Implementar a interface Comparable serve para indicar a ordem natural dos objetos desta classe
public class ContaBancaria implements Comparable<ContaBancaria>{
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

    @Override
    public int compareTo(ContaBancaria outraContaBancaria) {
        return Integer.valueOf(this.getNumeroDaConta()).compareTo(Integer.valueOf(outraContaBancaria.getNumeroDaConta()));
        // return Double.valueOf(this.getSaldoDaConta()).compareTo(Double.valueOf(outraContaBancaria.getSaldoDaConta()));
    }
}
