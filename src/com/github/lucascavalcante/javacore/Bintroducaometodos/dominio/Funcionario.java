package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

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
