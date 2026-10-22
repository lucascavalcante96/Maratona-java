package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public double resultado;

    public double somar(double numero, double numero2){
        double soma = numero + numero2;
        return resultado = soma;
    }

    public double subtrair(double numero, double numero2){
        double sub = numero - numero2;
        return resultado = sub;
    }
    public double multiplicar(double numero, double numero2){
        double multi = numero * numero2;
        return resultado = multi;
    }
    public double dividir(double numero, double numero2){
        double dividir = numero / numero2;
        return resultado = dividir;
    }
    public double resultado(){
        return resultado;
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altedaDoisNumeros");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
    }
}
