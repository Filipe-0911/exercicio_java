package br.com.exercicios.classes;

public class Animal {
    private String nome;
    private int quantidadeDePatas;

    public Animal(String nome, int quantidadeDePatas) {
        this.nome = nome;
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    @Override
    public String toString() {
        String tostring = "O nome deste animal é: " + this.nome;
        return tostring;
    }
}
