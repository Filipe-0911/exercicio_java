package br.com.exercicios.classes;

// Implementar a interface Comparable serve para indicar a ordem natural dos objetos desta classe
public class ContaBancaria implements Comparable<ContaBancaria>{
    private String nome;
    
    private int numeroDaConta;
    private double saldoDaConta;
    
    public ContaBancaria(String nome, int numeroDaConta, double saldoDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    }
    
    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }
    
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String string = "Nome: %s; Número: %d; Saldo R$%.2f.".formatted(this.nome ,this.numeroDaConta, this.saldoDaConta);
        return string;
    }
    
    @Override
    public int compareTo(ContaBancaria outraContaBancaria) {
        return Integer.valueOf(this.getNumeroDaConta()).compareTo(Integer.valueOf(outraContaBancaria.getNumeroDaConta()));
        // return Double.valueOf(this.getSaldoDaConta()).compareTo(Double.valueOf(outraContaBancaria.getSaldoDaConta()));
    }
}
