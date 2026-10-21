package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public double resultado = 0;

    public double somar(double numero){
        return resultado += numero;
    }

    public double subtrair(double numero){
        return resultado -= numero;
    }
    public double multiplicar(double numero){
        return resultado * numero;
    }
    public double dividir(double numero){
        return resultado / numero;
    }
    public double resultado(){
        return resultado;
    }
}
