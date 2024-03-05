package br.com.exercicios.classes;

import br.com.exercicios.interfaces.Quadrupede;

public class Cachorro extends Animal implements Quadrupede {
    private String raca;
    private String familia;
    
    public Cachorro(String raca, String familia, String nome, int quantidadeDePatas) {
        super(nome, quantidadeDePatas);
        this.raca = raca;
        this.familia = familia;
    }

    public String getFamilia() {
        return this.familia;
    }

    public String getRaca() {
        return raca;
    }

}
