package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextDouble();
        System.out.println("Digite + para somar, - para subtrair, * para multiplicar, / para dividir");
        sc.nextLine();
        String operacao = sc.nextLine();
        if (operacao.equals("+")) {
            calculadora.somar(numero1, numero2);
        }
        else if (operacao.equals("-")) {
            calculadora.subtrair(numero1, numero2);
        }
        else if (operacao.equals("*")) {
            calculadora.multiplicar(numero1, numero2);
        }
        else if (operacao.equals("/")) {
            calculadora.dividir(numero1, numero2);
        }
        sc.close();
        System.out.printf("O resultado da operação foi: %.1f", calculadora.resultado());
    }
}
