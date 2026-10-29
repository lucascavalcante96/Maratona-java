package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salarios;

    public void retornaDados(){
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Idade do funcionario: " + idade);
        System.out.println("Ultimos 3 salários: ");
        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i]);
        }
    }
    public void mediaSalario(){
        double soma = 0;
        for(int i = 0; i < salarios.length; i++){
            soma += salarios[i];
        }
        double media = soma/3;
        System.out.printf("A média salarial dos ultimos 3 salarios foi de: %.2f", media);
    }
}
