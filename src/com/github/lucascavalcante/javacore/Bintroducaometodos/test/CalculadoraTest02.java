package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = 1;
        int numero2 = 2;

        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro do CalculadoraTest02");
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
