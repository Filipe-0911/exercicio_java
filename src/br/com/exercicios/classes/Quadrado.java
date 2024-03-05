package br.com.exercicios.classes;
import java.lang.Math;

import br.com.exercicios.interfaces.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return "A área do quadrado é " + this.calcularArea() + " e o perímetro é " + this.calcularPerimetro();
    }
    
}
