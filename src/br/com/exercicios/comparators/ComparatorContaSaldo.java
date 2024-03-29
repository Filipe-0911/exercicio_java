package br.com.exercicios.comparators;

import java.util.Comparator;

import br.com.exercicios.classes.ContaBancaria;

// Criar um comparator serve para fornecer diferentes maneiras de ordenar objetos

public class ComparatorContaSaldo implements Comparator<ContaBancaria> {
    @Override
    public int compare(ContaBancaria conta1, ContaBancaria conta2) {
        return Double.compare(conta1.getSaldoDaConta(), conta2.getSaldoDaConta());
    }
    
}
