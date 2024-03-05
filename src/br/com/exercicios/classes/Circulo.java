package br.com.exercicios.classes;
import java.lang.Math;

import br.com.exercicios.interfaces.Forma;

public class Circulo implements Forma{
    private double raio;
    private double pi = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (this.pi * Math.pow(this.raio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.pi * this.raio);
    }

    @Override
    public String toString() {
        return "A área do círculo é " + this.calcularArea() + " e o perímetro é " + this.calcularPerimetro();
    }

}
