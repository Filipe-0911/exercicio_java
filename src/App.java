import java.util.ArrayList;

import br.com.exercicios.classes.Animal;
import br.com.exercicios.classes.Cachorro;
import br.com.exercicios.classes.Circulo;
import br.com.exercicios.classes.ContaBancaria;
import br.com.exercicios.classes.Produto;
import br.com.exercicios.classes.Quadrado;
import br.com.exercicios.comparators.ComparatorConta;
import br.com.exercicios.interfaces.Forma;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>(10);

        lista.add("Filipe");
        lista.add("Ianca");
        lista.add("Joaquim");
        lista.add("Olavo");
        lista.add("Olívia");

        for(String nome : lista) {
            System.out.println(nome);
        }

        Cachorro cachorro = new Cachorro("pitbull", "Canidae", "Abaré", 4);
        Animal animal = new Animal("Susy", 4);

        if(cachorro instanceof Animal) {
            Animal castingAnimal = (Animal) cachorro;

            System.out.println(castingAnimal);
        }
        
        System.out.println(animal);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>(10);

        Produto notebook = new Produto("Notebook", 2000.00);
        Produto celular = new Produto("Celular", 1200.00);
        Produto televisao = new Produto("Televisão", 3500);

        listaDeProdutos.add(notebook);
        listaDeProdutos.add(celular);
        listaDeProdutos.add(televisao);
        
        double precoTotal = 0;
        for(Produto produto : listaDeProdutos) {
            System.out.println();
            System.out.println(produto.getNome() + " custa: " + produto.getPreco());
            
            precoTotal += produto.getPreco();
        }

        
        double precoMedio = precoTotal / listaDeProdutos.size();

        String resultado = String.format("%.2f", precoMedio);

        System.out.println("O preço médio dos produtos é: R$ " + resultado);

        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(2);
        Circulo circulo3 = new Circulo(4);
        Circulo circulo4 = new Circulo(7);

        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(3);
        Quadrado quadrado3 = new Quadrado(4);
        Quadrado quadrado4 = new Quadrado(5);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        listaDeFormas.add(circulo1);
        listaDeFormas.add(circulo2);
        listaDeFormas.add(circulo3);
        listaDeFormas.add(circulo4);

        listaDeFormas.add(quadrado1);
        listaDeFormas.add(quadrado2);
        listaDeFormas.add(quadrado3);
        listaDeFormas.add(quadrado4);

        for(Forma forma : listaDeFormas) {
            System.out.println("A área desta forma é: " + forma.calcularArea());
        }

        ContaBancaria conta1 = new ContaBancaria(123, 2000.00);
        ContaBancaria conta2 = new ContaBancaria(456, 2010.00);
        ContaBancaria conta3 = new ContaBancaria(789, 3000.00);
        ContaBancaria conta4 = new ContaBancaria(198, 4500.00);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>(4);

        listaDeContas.add(conta4);
        listaDeContas.add(conta3);
        listaDeContas.add(conta2);
        listaDeContas.add(conta1);
        
        listaDeContas.sort(new ComparatorConta());
        
        ContaBancaria contaComMaiorSaldo = listaDeContas.get(0);

        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldoDaConta() > contaComMaiorSaldo.getSaldoDaConta()) {
                contaComMaiorSaldo = conta;
            }
        }

        System.out.println(contaComMaiorSaldo);
        

    }
}
