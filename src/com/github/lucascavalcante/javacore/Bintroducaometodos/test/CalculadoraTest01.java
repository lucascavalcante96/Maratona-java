package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        double numero;
        while (true){
            System.out.print("Digite um numero: 0 para sair");
            numero = sc.nextDouble();

            if (numero == 0){
                break;
            }

            calculadora.somar(numero);
        }
        sc.close();
        System.out.printf("A soma dos números digitados foram: %.1f", calculadora.resultado());
    }
}
