package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class Estutante {
    public String nome;
    public int idade;
    public char sexo;
    public int ano;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}
